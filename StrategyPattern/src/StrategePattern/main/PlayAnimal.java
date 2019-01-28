package StrategePattern.main;

import StrategePattern.Animal;
import StrategePattern.Eagle;
import StrategePattern.Tiger;

public class PlayAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger = new Tiger();
		tiger.shape();
		tiger.cry();
		tiger.fly();
		
		
		Animal eagle = new Eagle();
		eagle.shape();
		eagle.cry();
		eagle.fly();
	}

}
