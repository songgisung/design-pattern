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
		System.out.println("٣�񡡣���"+name);
	}
	
	void Confirm() {
		System.out.println("���ʪ��ΫګëȪ��ʪ�ު�����");
	}
}
