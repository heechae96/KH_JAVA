package com.kh.day11.wrapper;

public class Exam_wrapper {
	
	public static void main(String[] args) {
		
		int num = 0;
		// The constructor Integer(int) is deprecated since version 9
//		Integer soo = new Integer(0);
		Integer su = Integer.valueOf(num);	// 기본형 int -> Integer
		
		System.out.println(Character.toLowerCase('A'));	// 대문자 -> 소문자
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {	// 숫자인지 확인
			System.out.println(c1+"은 숫자");
		}
		if(Character.isAlphabetic(c2)) {	// 영문자인지 확인
			System.out.println(c2+"은 영문자");
		}
		
	}

}
