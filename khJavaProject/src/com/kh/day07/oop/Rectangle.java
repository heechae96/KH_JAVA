package com.kh.day07.oop;

public class Rectangle {
	
	public int width;	// 너비, 가로
	public int height;	// 높이, 세로
	
	// 메소드
	// (기본)생성자
	public Rectangle() {}
	
	// 매개변수가 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 반환형이 있는 메소드
	// getArea를 호출한 쪽에 반환
	public int getArea() {
		int area = width * height;
		return area;
	}

}
