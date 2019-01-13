package singletonPattern;


public class singletonPattern {
		
	public static void main(String []args) {
		System.out.println("hello singletonPattern");
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();

		System.out.println("singleton1 =" + single1.getNum());
		System.out.println("singleton2 =" + single2.getNum());		
		aa();
		bb();
		cc();
		dd();
		
		single1.setNum(13);
		
		System.out.println("singleton1 =" + single1.getNum());
		System.out.println("singleton2 =" + single2.getNum());		
		aa();
		bb();
		cc();
		dd();
			
	}
	
	
	
	public static void aa() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("aa =" + single1.getNum());
	}
	
	public static void bb() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("bb =" + single1.getNum());
	}
	public static void cc() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("cc =" + single1.getNum());
	}
	public static void dd() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("dd =" + single1.getNum());
	}
	

	
}
