package find_friend.utils.sendcloud;

import org.apache.http.client.ClientProtocolException;

import java.io.IOException;

public class SendSMS {

	public static String send(String phone,String code) throws ClientProtocolException, IOException {
		SendCloudSms sms = new SendCloudSms();
		sms.setMsgType(0);
		sms.setTemplateId(10684);
		sms.addPhone(phone);
		sms.addVars("code",code);
		//sms.addVars("company", "同道");
		//sms.addVars("date", "2016.04.02");

		SendCloud sc = SendCloudBuilder.build();
		ResponseData res = sc.sendSms(sms);

		System.out.println(res.getResult());
		System.out.println(res.getStatusCode());
		System.out.println(res.getMessage());
		System.out.println(res.getInfo());
		return res.getMessage();
	}
	public static void inform(){
		try {
			send("13487079637", "maxUnused");
		}catch (Exception e){}
	}

	public static void main(String[] args) throws Throwable {
		send("13487079637","maxUnused");
	}
}
