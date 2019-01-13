public class Service implements MailService {
	
	@Override
	public String runMail() {
		System.out.println("service");
		return "run mail";
	}
}
