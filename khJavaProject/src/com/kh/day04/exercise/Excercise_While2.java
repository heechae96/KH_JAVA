package com.kh.day04.exercise;

import java.util.Scanner;

public class Excercise_While2 {

	public static void main(String[] args) {

		// 정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요
		// 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력해야 합니다"를 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(1~9): ");
		int input = sc.nextInt();

		if (input > 0 && input < 10) {
			int i = 1;
			while (i < 10) {
				System.out.println(input + "*" + i + "=" + (input * i));
				i++;
			}
		} else {
			System.out.println("1~9사이의 양수를 입력해야 합니다");
		}

	}

}
