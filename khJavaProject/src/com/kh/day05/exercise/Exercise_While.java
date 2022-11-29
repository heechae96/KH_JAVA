package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while문을 이용하여 1~100사이의 홀수의 합을 출력하세요
		int i = 1;
		int sum = 0;
		while (i < 100) {
//					System.out.println(i);
			sum += i;
			i += 2;
		}

		System.out.println("1~100사이의 홀수의 합: " + sum);
	}

	public void exercise2() {
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

	private void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면
		// 입력한 수의 합을 출력하세요
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 : 14

		Scanner sc = new Scanner(System.in);

		int input = 0;
		int sum = 0;

		while (true) {
			System.out.print("정수 하나 입력: ");
			input = sc.nextInt();
			if (input == -1) {
				break;
			}
			sum += input;
		}
		System.out.println("입력하신 수의 합은 : " + sum);
	}

}
