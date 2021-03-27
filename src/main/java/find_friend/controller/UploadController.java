package find_friend.controller;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import find_friend.constant.SystemCode;
import find_friend.utils.JsonResponse;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**上传文件controller*/
@RequestMapping("/upload")
@Controller
public class UploadController {

	private final static Logger logger = LoggerFactory.getLogger(UploadController.class);

	@ResponseBody
	@RequestMapping(value = "/uploadimg/{type}", method = RequestMethod.POST)
	public JsonResponse<String> uploadImg(HttpServletRequest request, HttpSession session,
										  @PathVariable String type) throws Exception {
		String param=request.getParameter("param");
		JsonResponse<String> jr=new JsonResponse<String>(SystemCode.NULL_ARGUMENT,"上传文件无法获取");
		MultipartHttpServletRequest r=(MultipartHttpServletRequest)request;
		MultipartFile mFile=null;
		if(StringUtils.isEmpty(param)){
			mFile=r.getFile("file");
		}else{
			mFile=r.getFile(param);
		}
		String OriginalfileName=mFile.getOriginalFilename();
		//文件名采用时间戳+随机数
		String fileName = OriginalfileName.substring(OriginalfileName.lastIndexOf(".")+1);
		fileName=(int)(Math.random()*10000)+"."+fileName;
		fileName=System.currentTimeMillis()+fileName;
		if(mFile!=null){
			 if(mFile.getSize()>5242880){
				//如果文件大于5M就不给上传
				jr=new JsonResponse(SystemCode.INNER_ERROR,"文件大小不能超过5M");
				return jr;
			}else{
				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
				String month=sdf.format(new Date());
				String fileDirPath=type+"/"+month+"/";
				saveFile(mFile.getBytes(),fileName,fileDirPath);
				//上传完后删除上次文件
				String preImg=request.getParameter("preImg");
				if(StringUtils.isNotEmpty(preImg)){
					removeFile(preImg);
				}else{
					logger.info("无须删除旧图片"+preImg);
				}
				jr=new JsonResponse(SystemCode.SUCCESS, fileDirPath+fileName);
				logger.info(request.getRemoteAddr()+"上传图片："+fileDirPath+fileName+"成功，图片大小为："+mFile.getSize());
			}
		}
		return jr;
	}
	public void saveFile(byte[] content, String fileName,String fileDirPath)
			throws IOException {
		Configuration cfg = new Configuration(Zone.zone2());
		//...其他参数参考类注释
		UploadManager uploadManager = new UploadManager(cfg);

		//获取授权
		String accessKey = "dLZPYXGo-nMng61m1CCBViDrlZu0FmAUjl7OgIyb";
		String secretKey = "TjcczPCMv5Ur5h_c8iqtUqNXiQdJAJZFI5-7BUv6";
		String bucket = "together";
		Auth auth = Auth.create(accessKey, secretKey);
		String upToken = auth.uploadToken(bucket);
		logger.info("upload");

		//文件名
		String key = fileDirPath+fileName;

		try {
			Response response = uploadManager.put(content, key, upToken);
			//解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
		} catch (QiniuException ex) {
			Response r = ex.response;
			System.err.println(r.toString());
			try {
				System.err.println(r.bodyString());
			} catch (QiniuException ex2) {
				//ignore
			}
		}

	}
	@RequestMapping("/removeFile")
	@ResponseBody
	public  JsonResponse<String> remove(HttpServletRequest request) throws IOException {
		return new JsonResponse<String>(removeFile(request.getParameter("preImg")),"删除成功");
	}
	public  int removeFile(String filename) throws IOException {

		int i=filename.indexOf("com");
		if(i>=0) {
			filename = filename.substring(i + 4);
		}
		logger.info("删除图片："+filename);
		Configuration cfg = new Configuration(Zone.zone2());

		//获取授权
		String accessKey = "QshVULGBPdZ2SMDfFc86UDr6t3pR2j4rX7exbD00";
		String secretKey = "7bSth4WS4WqGkQrHxGh2wATE1gOv35GRkaBOx4j4";
		String bucket = "celife";
		String key = filename;
		Auth auth = Auth.create(accessKey, secretKey);
		BucketManager bucketManager = new BucketManager(auth, cfg);
		try {
			bucketManager.delete(bucket, key);
		} catch (QiniuException ex) {
			//如果遇到异常，说明删除失败
			System.err.println(ex.code());
			System.err.println(ex.response.toString());
		}
		return 1;
	}
	/**
	 * 下载
	 * @param response
	 * @return
	 */
	@RequestMapping("/downLoad")
	public HttpServletResponse download(String preImg, String fileName, HttpServletResponse response) {
        try {
        	  // perImg是指欲下载的文件的路径。
        	//preImg=preImg.replaceAll("file","pic");
    		File file=new File(preImg);
            // 取得文件名。
            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(preImg));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            fileName = URLEncoder.encode(fileName,"UTF-8");
            response.addHeader("Content-Disposition", "attachment;filename=" +fileName);
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }
	/**
	 * 
	 * @param preImg
	 * @param response
	 * @return 批量下载
	 *  perImg 文件路径 以','隔开，fileName zip包的名字
	 */
	@RequestMapping("/zipDownLoad")
	public HttpServletResponse zipDownLoad(String preImg, HttpServletResponse response) {
        try {
        	String strs[]=preImg.split(",");
        	File[] file1 = new File[strs.length];
        	long length=0;
	   		 for(int i=0;i<file1.length;i++){
	   			file1[i]=new File(strs[i]);
	   			length=length+file1[i].length();
	   		 }
	   		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			String month=sdf.format(new Date());
        	//fileName = URLEncoder.encode(fileName,"UTF-8");
	        String strZipName = month+".zip";
	    	response.addHeader("Content-Disposition", "attachment;filename=" +strZipName);
            //response.addHeader("Content-Length", ""+length);
            response.setContentType("application/octet-stream");
    		 ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(response.getOutputStream()));
    		
    		for(int i=0;i<file1.length;i++) {
    			FileInputStream fis = new FileInputStream(file1[i]);
    			byte[] buffer = new byte[fis.available()];
    			out.putNextEntry(new ZipEntry(file1[i].getName()));
    			int len;
    			while((len = fis.read(buffer))>0) {
    				out.write(buffer,0,len);
    			}
    			out.closeEntry();
    			fis.close();
    		}
    		out.flush();
    		out.close();
	      }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
