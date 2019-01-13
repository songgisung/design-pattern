package singletonPattern;

public class Singleton {
	private static Singleton singleton;
	private int num;
	private Singleton() {
		System.out.println("instance insert");
		num = 0;
		
	}
	
	public static Singleton getInstance() {
		
			if(singleton == null) {
				singleton= new Singleton();
			}
			return singleton;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
}
