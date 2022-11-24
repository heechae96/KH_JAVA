package com.kh.day02.variable;

public class TestVariable {

	public static void main(String[] args) {

		// 변수?
		// -> 변하는 수

		// 자료형 변수명 대입연산자 데이터;
		int kh = 34;
		String msg = "Hello world";

		System.out.println("kh");
		System.out.println(34);
		System.out.println("Hello World");

		// 변수 사용 이유는? 재사용을 위함
		System.out.println(kh);
		System.out.println(kh);
		System.out.println(kh);
		System.out.println(msg);
		System.out.println(msg);
		System.out.println(msg);

		// int num = 100;
		int num; // 변수의 선언
		num = 100; // 변수의 초기화
		System.out.println(num);
		
		// 변수의 특성. 값을 변경 가능
		num = 101;	
		System.out.println(num);
		
		num = num + 1;
		System.out.println(num);

	}

}
