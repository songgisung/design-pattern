public class Proxy implements MailService{

	MailService mService;
	
	@Override
	public String runMail() {
		System.out.println("proxy");
		mService = new Service();
		return mService.runMail();	
	}
}
