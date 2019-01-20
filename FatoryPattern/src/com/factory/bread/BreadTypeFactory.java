package com.factory.bread;

public class BreadTypeFactory extends BreadFactory{

	@Override
	public Bread createBread(String name) {
		Bread bread = null;
		
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
