package com.kh.day02.exercise;

public class Excercise_Logical1 {

	public static void main(String[] args) {

		// 50이 1 ~ 100사이의 숫자인지 확인하세요
		// 단, 50이라는 숫자는 변수 num에 초기화 하시오
		// 1부터 100사이의 숫자인가? true
		
		int num = 50;
		boolean result = (1 < num) && (num < 100); // t t t
		System.out.println("1부터 100사이의 숫자인가? " + result);
	}

}
