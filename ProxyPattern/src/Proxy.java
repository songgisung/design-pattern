public class Proxy implements MailService{

	private MailService mService;
	
	Proxy(MailService real){
		this.mService = real;
	}
	
	@Override
	public void runMail1() {
		System.out.println("mail post : 1 by Proxy");
	}

	@Override
	public void runMail2() {
		this.mService.runMail2();
	}
}
