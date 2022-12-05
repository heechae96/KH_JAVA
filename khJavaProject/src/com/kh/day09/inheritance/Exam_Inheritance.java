package com.kh.day09.inheritance;

class Child extends Parent{	// Parent클래스를 상속
	
}

class Parent{
	private int money = 2000;	// 캡슐화의 원칙
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money += money;
	}
}
public class Exam_Inheritance {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println("Parent money: " + child.getMoney());
		child.setMoney(3000);
		System.out.println("Parent money: " + child.getMoney());
	}

}
