package com.factory.food;

public class FoodTypeFactory extends FoodFactory{

	@Override
	public Food createFood(String name) {
		Food bread = null;
		
		switch(name) {
		case("choco"):
			bread = new Choco();
		break;
		case("ichigo"):
			bread = new Ichigo();
		break;
		case("cream"):
			bread = new Cream();
		break;
		case("banana"):
			bread = new Banana();
		break;
		default:
			bread = new Choco();
		}
		
		return bread;
	}
}
