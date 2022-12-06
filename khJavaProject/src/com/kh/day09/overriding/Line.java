package com.kh.day09.overriding;

public class Line extends Shape{
	// 오버라이딩 애너테이션
	@Override
	public void draw() {
		System.out.println("line");
	}

}
