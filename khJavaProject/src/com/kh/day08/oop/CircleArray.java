package com.kh.day08.oop;

class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {

		Circle[] c = new Circle[5];	// 선언 및 할당

		for (int i = 0; i < c.length; i++) {	// 생성 및 초기화
			c[i] = new Circle(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i].getArea() + " ");
		}

	}

}
