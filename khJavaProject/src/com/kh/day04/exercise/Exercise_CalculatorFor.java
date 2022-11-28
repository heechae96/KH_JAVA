package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_CalculatorFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		for (;;) { // 무한반복문
			System.out.print("정수 하나 입력: ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력: ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %): ");
			char operator = sc.next().charAt(0);
			int result = 0;

			// 연산자 판별 후 연산 수행 그리고 결과를 저장
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			}

			System.out.println("결과: " + num1 + operator + num2 + "=" + result);
			cnt++;	// 결과 출력했을때 카운트 업!!

			if (cnt == 3) {	// 3번만 실행하고 종료하도록 설정
				break;
			}

		}

	}

}
