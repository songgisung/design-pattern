package singletonPattern;


public class singletonPattern {
		
	public static void main(String []args) {
		System.out.println("hello singletonPattern");
		Singleton master = master.getInstance();
		
		animal("dog");
		animal("pig");
		animal("cat");
		animal("rabbit");

		System.out.println("主人をakikoに決めます。");
		master.setMaster("akiho");
		
		animal("dog");
		animal("pig");
		animal("cat");
		animal("rabbit");		

		System.out.println("主人をtanakaに決めます。");
		master.setMaster("tanaka");
		
		animal("dog");
		animal("pig");
		animal("cat");
		animal("rabbit");	
	}
	
	
	public static void animal(String animal) {
		Singleton master = Singleton.getInstance();
		System.out.println(animal + " : master name = " + master.getMaster());
	}

	
}
