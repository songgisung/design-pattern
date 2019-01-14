
public class Main {

	public static void main(String []args) {
		
		MailService real = new Service();
		
		MailService proxy1 = new Proxy(real);
		MailService proxy2 = new Proxy(real);

		
		proxy1.runMail1();
		proxy2.runMail1();
		
		proxy1.runMail2();
		proxy2.runMail2();
		
	}
}
