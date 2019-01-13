
public class Main {

	public static void main(String []args) {
		MailService proxy = new Proxy();
		System.out.println(proxy.runMail());
	}
}
