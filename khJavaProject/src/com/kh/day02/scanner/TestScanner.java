package com.kh.day02.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("int값을 입력해주세요: ");
		int input = sc.nextInt();
		System.out.println("입력한 값: " + input);
		
		System.out.println("int값을 한번 더 입력해주세요: ");
		int input2 = sc.nextInt();
		System.out.println("한번 더 입력한 값: " + input2);
		
		int result = input + input2;
		System.out.println("두 값의 합: " + result);
	}

}
