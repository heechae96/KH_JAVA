package com.kh.day07.oop;

public class Circle {	// 클래스 선언(class Circle), 클래스 접근 권한 public
	
	// 필드	
	// 멤버 변수
	public int radius;		// 접근 지정자 public
	public String name;
//	public int radius = 1;
//	public String name = "원";
	
	// (기본)생성자
	//	-> 생략 가능
	// 클래스명과 이름이 같아야 한다
	// 객체 생성!
	// 필드 초기화!
	public Circle() {	// 접근 지정자 public
		this.radius = 1;
		this.name = "원";
	}
	
	// 멤버 메소드
	// 반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() {	// 접근 지정자 public
		double area = 3.14 * radius * radius;
		return area;
//		return 3.14 * radius * radius;
	}

}
