package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String[] args) {

//		ColorPoint cp = new ColorPoint();	// 기본 생성자가 없어서 에러!
//		cp.set(3, 4);			// Point의 set() 호출
//		cp.setColor("red");		// ColorPoint의 setColor() 호출
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();	 // 컬러와 좌표 출력
	}

}
