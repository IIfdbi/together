package find_friend.utils.sendcloud;

public class SendCloudBuilder {

	public static SendCloud build() {
		SendCloud sc = new SendCloud();
		sc.setServer(Config.server);
		sc.setSmsAPI(Config.send_sms_api);
		return sc;
	}
}