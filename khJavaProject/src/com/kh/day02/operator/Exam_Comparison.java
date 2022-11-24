package com.kh.day02.operator;

public class Exam_Comparison {

	public static void main(String[] args) {

		// 비교 연산자
		// -> 두 값을 비교하는 연산자, 관계연산자
		// -> 비교연산자는 조건을 만족하면 true, 아니면 false를 반환
	
		System.out.println(1 < 2);
		System.out.println(2 > 3);
		System.out.println(1 == 2);
		System.out.println(1 != 1);
		
		int num1 = 50;
		int num2 = 30;
		boolean result = (num1 < num2);
		System.out.println("(num1 < num2)의 결과는: " + result);
		result = (num1 > num2);
		System.out.println("(num1 > num2)의 결과는: " + result);
		result = (num1 == num2);
		System.out.println("(num1 == num2)의 결과는: " + result);
		result = (num1 != num2);
		System.out.println("(num1 != num2)의 결과는: " + result);
		
		// 짝수 홀수 판별 프로그램
		// 짝수란?
		// 	2로 나눈 나머지가 0
		int num = 2;
		result = (num % 2 == 0);
		System.out.println("짝수인가요? " + result);
	}

}
