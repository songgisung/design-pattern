package com.factory.main;

import com.factory.food.Food;
import com.factory.food.FoodTypeFactory;

public class BreadFactoryMain {

	public static void main(String [] args) {
		FoodTypeFactory ftf = new FoodTypeFactory();
		
		Food bread1 =  ftf.createFood("choco");
		Food bread2 =  ftf.createFood("ichigo");
		Food bread3 =  ftf.createFood("cream");
		Food bread4 =  ftf.createFood("banana");
		
		System.out.println(bread1.getName());
		System.out.println(bread2.getName());
		System.out.println(bread3.getName());
		System.out.println(bread4.getName());
	}
}
