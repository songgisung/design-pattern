package StrategePattern;

import StrategePattern.cry.Cry;
import StrategePattern.fly.Fly;

public abstract class Animal {

	public Animal() {}
	
	protected Fly fly;
	protected Cry cry;
	
	public void cry() {
		cry.cry();
	}
	
	public void fly() {
		fly.fly();
	}
	
	public void move() {
		System.out.println("move");
	}
	
	public abstract void shape();
}


