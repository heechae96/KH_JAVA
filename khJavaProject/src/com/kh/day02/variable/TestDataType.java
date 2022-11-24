package com.kh.day02.variable;

public class TestDataType {

	public static void main(String[] args) {

		// 1. 자료형의 종류

		// 정수형
		byte bNum = 127; // -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int iNum = 2147483647; // -2147483648 ~ 2147483647(약 21억)
		long lNum = 999999999999L; // 접미사 L또는 l을 붙여야함

		// 실수형
		// -> 평균 구할때 사용하게 될 것
		float fNum = 22.1123f; // 접미사 f또는 F를 붙여야함
		double dNum = 23.502;

		// 문자형
		char fChar = 'A'; // 홑따옴표 안에는 1개의 문자
		String sChar = "Hello Java"; // 쌍따옴표 안에는 n개의 문자 (문자열)

		// Boolean형
		boolean result = false; // false 또는 true

		System.out.println("정수의 값: " + iNum);
		System.out.println("정수의 값(9999억): " + lNum);
		System.out.println("실수의 값: " + fNum);
		System.out.println("실수의 값: " + dNum);
		System.out.println("문자의 값: " + fChar);
		System.out.println("문자열의 값: " + sChar);
		System.out.println("논리의 값: " + result);

		// ASCII(아스키)코드
		// -> 문자(char)는 숫자를 저장할 수 있고 ASCII코드에
		//		매핑되어있는 문자로 출력이 가능
		fChar = 66;	// 아스키 코드로 B
		System.out.println("문자에 숫자: " + fChar);
		fChar = 75;	// 아스키 코드로 K
		System.out.println("문자에 숫자: " + fChar);
	}

}
