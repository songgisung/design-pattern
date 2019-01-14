package singletonPattern;

public class Singleton {
	
	private static Singleton singleton;
	private String master;
	
	private Singleton() {
		System.out.println("instance insert");
		master = "";
		
	}
	
	public static Singleton getInstance() {
		
			if(singleton == null) {
				singleton= new Singleton();
			}
			return singleton;
	}
	
	public String getMaster() {
		return master;
	}
	
	public void setMaster(String name) {
		this.master = name;
	}
	
}
