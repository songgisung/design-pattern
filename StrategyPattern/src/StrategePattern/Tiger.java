package StrategePattern;

import StrategePattern.cry.TigerCry;
import StrategePattern.fly.FlyNo;

public class Tiger extends Animal{

	public Tiger() {
		cry = new TigerCry();
		fly = new FlyNo();
	}

	public void shape() {
		System.out.println("Tiger_shape");
	}
}
