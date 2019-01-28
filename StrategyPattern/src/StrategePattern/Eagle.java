package StrategePattern;

import StrategePattern.cry.BirdCry;
import StrategePattern.fly.FlyYes;

public class Eagle extends Animal{

	public Eagle() {
		cry = new BirdCry();
		fly= new FlyYes();
	}
	
	public void shape() {
		System.out.println("Eagle_shape");
	}
	
}
