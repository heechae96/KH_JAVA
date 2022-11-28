package com.kh.day04.exercise;

public class Exercise_PrintSample {

	public static void main(String[] args) {

		// 정수 + 문자열 -> 문자열
		System.out.println(1 + "1문자열");	// 11문자열

		// 문자 + 문자 -> 정수
		System.out.println('1' + '1');		// 98

		// 문자 + 정수 -> 정수
		System.out.println('1' + 1);		// 50
		
		// print메서드 관련
		System.out.print("정수 입력: ");						// 바로 옆에 입력
		System.out.println("정수 입력: ");						// 줄바꾸고 입력
		System.out.printf("정수 출력: %d%n",1);					// %d자리에 1이 들어감
		System.out.printf("문자열 출력: %s\n", "Hello World");	// %s자리에 "Hello World"가 들어감
	}

}
