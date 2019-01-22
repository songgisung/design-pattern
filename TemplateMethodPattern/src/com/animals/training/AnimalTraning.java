package com.animals.training;

public abstract class AnimalTraning {
	protected void Animal_Training(String name) {
		GiveName(name);
		FoodFeed();
		Train();
		Confirm();
	}
	
	abstract void FoodFeed();
	abstract void Train();
	
	void GiveName(String name) {
		System.out.println("animal : "+name);
	}
	
	void Confirm() {
		System.out.println("Traning complete\n");
	}
}
