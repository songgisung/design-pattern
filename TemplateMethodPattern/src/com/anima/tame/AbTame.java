package com.anima.tame;

public abstract class AbTame {
	protected void AnimalTame(String name) {
		GiveName(name);
		FoodFeed();
		Train();
		Confirm();
	}
	
	abstract void FoodFeed();
	abstract void Train();
	
	void GiveName(String name) {
		System.out.println("Ù£îñ¡¡£º¡¡"+name);
	}
	
	void Confirm() {
		System.out.println("ª¢ªÊª¿ªÎ«Ú«Ã«Èª¬ªÊªêªÞª·ª¿¡£");
	}
}
