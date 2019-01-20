package com.factory.main;

import com.factory.bread.Bread;
import com.factory.bread.BreadTypeFactory;

public class BreadFactoryMain {

	public static void main(String [] args) {
		BreadTypeFactory BTF = new BreadTypeFactory();
		
		Bread bread1 =  BTF.createBread("choco");
		Bread bread2 =  BTF.createBread("ichigo");
		Bread bread3 =  BTF.createBread("cream");
		Bread bread4 =  BTF.createBread("banana");
		
		System.out.println(bread1.getName());
		System.out.println(bread2.getName());
		System.out.println(bread3.getName());
		System.out.println(bread4.getName());
	}
}
