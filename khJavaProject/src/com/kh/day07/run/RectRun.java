package com.kh.day07.run;

import com.kh.day07.oop.Rectangle;

public class RectRun {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(10, 20);
//		rec.width = 10;
//		rec.height = 20;
		System.out.println("넓이의 값: " + rec.getArea());
	}

}
