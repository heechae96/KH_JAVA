package com.kh.day02.exercise;

import java.util.Scanner;

public class Excercise_Logical2 {

	public static void main(String[] args) {

		// 입력받은 문자가 대문자인지 소문자인지 확인하세요
		// 영어 대문자 확인 : true

		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		char ch = sc.next().charAt(0);
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);

	}

}
