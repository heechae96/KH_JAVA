package com.kh.day09.point;

public class ColorPoint extends Point{ 	// Point클래스를 상속
	private String color;				// 점의 색
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {	// 색, 좌표 출력
		System.out.println(color);
		showPoint();				// Point클래스의 showPoint() 호출
	}
	
}
