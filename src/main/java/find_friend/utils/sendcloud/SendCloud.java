package find_friend.utils.sendcloud;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.Asserts;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.*;

/**
 * 
 * 发送邮件代码示例
 * <p>
 * <blockquote>
 * 
 * <pre>
 * SendCloud sc = SendCloudBuilder.build();
 * 
 * // 创建邮件body
 * MailBody body = new MailBody();
 * body.setFrom("test@163.com");
 * body.setFromName("张三");
 * body.setReplyTo("service@qq.com");
 * body.setSubject("测试");
 * // 创建文件附件
 * body.addAttachments(new File("D:/test.txt"));
 * // 创建流附件
 * body.addAttachments(new FileInputStream(new File("D:/ff.png")),"ff.png");
 * // 邮箱收件人
 * MailAddressReceiver receiver = new MailAddressReceiver();
 * receiver.setBroadcastSend(true);// 广播发送(收件人会全部显示)
 * receiver.addTo("1234@qq.com");
 * 
 * // 地址列表收件人
 * // MailListReceiver receiver=new MailListReceiver();
 * // 添加邮件地址列表
 * // receiver.addMailList("developers@sendcloud.com");
 * 
 * // 创建模版邮件内容
 * TemplateContent content = new TemplateContent();
 * content.setTemplateInvokeName("templateInvokeName");
 * 
 * // 创建文本邮件内容
 * // TextContent content = new TextContent();
 * // content.setContent_type(ScContentType.html);
 * // content.setText("hello world");
 * 
 * // 创建邮件
 * SendCloudMail scmail = new SendCloudMail();
 * scmail.setBody(body);
 * scmail.setContent(content);
 * scmail.setTo(receiver);
 * 
 * // 发信
 * ResponseData result = sc.sendMail(scmail);
 * System.out.println(JSONObject.fromObject(result).toString());
 * </pre>
 * 
 * </blockquote>
 * <p>
 * 
 * 发送短信代码示例
 * 
 * 
 * <p>
 * <blockquote>
 * 
 * <pre>
 * SendCloud sc = SendCloudBuilder.build();
 * 
 * SendCloudSms sms = new SendCloudSms();
 * sms.setTemplateId(65825);
 * sms.addPhone("13512345678");
 * sms.addVars("code", "123456");
 * 
 * ResponseData result = sc.sendSms(sms);
 * 
 * System.out.println(JSONObject.fromObject(result).toString());
 * </pre>
 * 
 * </blockquote>
 * <p>
 * 
 * 发送语音代码示例
 * <p>
 * <blockquote>
 * 
 * <pre>
 * SendCloud sc = SendCloudBuilder.build();
 * 
 * SendCloudVoice sms = new SendCloudVoice();
 * sms.setPhone("13312345678");
 * sms.setCode("1234");
 * 
 * ResponseData result = sc.sendVoice(sms);
 * 
 * System.out.println(JSONObject.fromObject(result).toString());
 * </pre>
 * 
 * </blockquote>
 * <p>
 * 
 * @author SendCloud
 *
 */
public class SendCloud {

	private String server;
	private String mailAPI;
	private String templateAPI;
	private String smsAPI;
	private String voiceAPI;

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getMailAPI() {
		return mailAPI;
	}

	public void setMailAPI(String mailAPI) {
		this.mailAPI = mailAPI;
	}

	public String getTemplateAPI() {
		return templateAPI;
	}

	public void setTemplateAPI(String templateAPI) {
		this.templateAPI = templateAPI;
	}

	public String getSmsAPI() {
		return smsAPI;
	}

	public void setSmsAPI(String smsAPI) {
		this.smsAPI = smsAPI;
	}

	public String getVoiceAPI() {
		return voiceAPI;
	}

	public void setVoiceAPI(String voiceAPI) {
		this.voiceAPI = voiceAPI;
	}

	/**
	 * 发送短信
	 *
	 * @param sms
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public ResponseData sendSms(SendCloudSms sms) throws  IOException {
		Asserts.notNull(sms, "sms");
		Asserts.notBlank(Config.sms_user, "sms_user");
		Asserts.notBlank(Config.sms_key, "sms_key");
		Credential credential = new Credential(Config.sms_user, Config.sms_key);
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("smsUser", credential.getApiUser());
		treeMap.put("msgType", sms.getMsgType().toString());
		treeMap.put("phone", sms.getPhoneString());
		treeMap.put("templateId", sms.getTemplateId().toString());
		treeMap.put("timestamp", String.valueOf((new Date()).getTime()));
		if (MapUtils.isNotEmpty(sms.getVars()))
			treeMap.put("vars", sms.getVarsString());
		String signature = Md5Util.md5Signature(treeMap, credential.getApiKey());
		treeMap.put("signature", signature);
		Iterator<String> iterator = treeMap.keySet().iterator();
		List<NameValuePair> params = new ArrayList<NameValuePair>();

		while (iterator.hasNext()) {
			String key = iterator.next();
			params.add(new BasicNameValuePair(key, treeMap.get(key)));
		}

		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(smsAPI);
		httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		HttpResponse response = httpclient.execute(httpPost);
		ResponseData result = validate(response);
		httpPost.releaseConnection();
		httpclient.close();
		return result;
	}

	/**
	 * 解析返回结果
	 * 
	 * @param response
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	private ResponseData validate(HttpResponse response) throws ParseException, IOException {
		String s = EntityUtils.toString(response.getEntity());
		ResponseData result = new ResponseData();
		if (JSONUtils.mayBeJSON(s)) {
			JSONObject json = JSONObject.fromObject(s);
			if (json.containsKey("statusCode")) {
				result.setStatusCode(json.getInt("statusCode"));
				result.setMessage(json.getString("message"));
				result.setResult(json.getBoolean("result"));
				result.setInfo(json.getJSONObject("info").toString());
			} else {
				result.setStatusCode(500);
				result.setMessage(json.toString());
			}
		} else {
			result.setStatusCode(response.getStatusLine().getStatusCode());
			result.setMessage("发送失败");
			result.setResult(false);
		}
		return result;
	}


}