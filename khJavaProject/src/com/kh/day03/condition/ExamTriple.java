package com.kh.day03.condition;

import java.util.Scanner;

public class ExamTriple {

	public static void main(String[] args) {

		/*
		 * 삼항연산자 항목이 3개 
		 * (조건식) ? 참일 때 : 거짓일 때 
		 * 조건식은 반드시 true 또는 false를 반환 
		 * 비교/논리 연산자를 주로 사용
		 * 
		 * (num1 > num2) ? "참" : "거짓" 
		 * 정수를 입력받아 짝수인지 홀수인지 판별하는 
		 * 프로그램을 작성하세요
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "은/는 " + result + "입니다");

	}

}
