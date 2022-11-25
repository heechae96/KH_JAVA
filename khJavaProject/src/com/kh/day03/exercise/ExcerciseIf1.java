package com.kh.day03.exercise;

import java.util.Scanner;

public class ExcerciseIf1 {

	public static void main(String[] args) {

		/*
		 * 정수하나를 입력받아서 양의 정수인지, 0인지, 음의 정수인지
		 * 판별하는 프로그램을 작성하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요: ");
		int input = sc.nextInt();
		
		String result = "";
		
		if(input > 0) {
			result = "양의 정수";
		}else if(input < 0) {
			result = "음의 정수";
		}else {
			result = "0";
		}
		
		System.out.println(input + "은/는 " + result + "입니다");
	}

}
