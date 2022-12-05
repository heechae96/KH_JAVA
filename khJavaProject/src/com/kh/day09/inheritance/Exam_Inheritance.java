package com.kh.day09.inheritance;

import com.kh.day09.point.Point;

class BlackPoint extends Point{
	void set() {	// 부모의 멤버변수는 메소드 안에서!
		pub = 1;
		pro = 2;	// 다른 패키지의 protected 변수
//		def = 3;	// 다른 패키지의 default변수
//		pri = 4;
	}
}

class Child extends Parent{	// Parent클래스를 상속
	void set() {
		pub = 1;
		pro = 2;
		def = 3;
//		pri = 4;	// The field Parent. pri is not visible
	}
}

class Parent{
	// 접근지정자 test
	public int pub;
	protected int pro;
	int def;
	private int pri;
	
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
