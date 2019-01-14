package singletonPattern;


public class singletonPattern {
		
	public static void main(String []args) {
		System.out.println("hello singletonPattern");
		Singleton single1 = Singleton.getInstance();
		
	
		dog1();
		dog2();
		dog3();
		dog4();
		
		
		single1.setMaster("akiho");
		
		
		dog1();
		dog2();
		dog3();
		dog4();
			
	}
	
	
	
	public static void dog1() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("dog1 master name = " + single1.getMaster());
	}
	
	public static void dog2() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("dog2 master name = " + single1.getMaster());
	}
	public static void dog3() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("dog3 master name = " + single1.getMaster());
	}
	public static void dog4() {
		Singleton single1 = Singleton.getInstance();
		System.out.println("dog4 master name = " + single1.getMaster());
	}
	

	
}
