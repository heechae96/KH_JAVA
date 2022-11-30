package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하세요

		int[] arr;
		arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void exercise2() {
		// 길이가 5인 String배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후 , for문을 활용해서 바나나가 있으면 바나나를 출력해보세요

		String[] arr = { "딸기", "복숭아", "키위", "사과", "바나나" };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "바나나") {
				System.out.println(arr[i]);
			}
		}

	}

	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 입력받은 값들의 평균을 구하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 양의 정수를 입력하세요: ");
			arr[i] = sc.nextInt();
//			System.out.println("입력받은 값: " + arr[i]);
			sum += arr[i];
		}

		avg = (double) sum / arr.length;
		System.out.println("평균은 : " + avg);

	}

	public void exercise4() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하세요
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 양의 정수를 입력하세요: ");
			arr[i] = sc.nextInt();
		}

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		System.out.println("제일 큰 수는: " + max);

	}

	public void exercise5() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 210618-1124600 -> 210618-1******
		// 200518-3233920 -> 200518-3******

		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		System.out.print("주민등록번호 입력(-포함) : ");
		String memberNum = sc.next();

		// String으로 입력받은 값을 하나씩 잘라서 origin 문자 배열에 넣기
		for (int i = 0; i < memberNum.length(); i++) {
			origin[i] = memberNum.charAt(i);
			System.out.print(origin[i]);
		}

		System.out.println("\n------변경후------");

		// 얕은복사 -> 우리가 원하는것이 아님. 원본이 유지가 안됨
//		char[] copy = origin;
//		for(int i=0; i<origin.length; i++) {
//			if(i>7) {
//				copy[i] = '*';
//			}
//			System.out.print(copy[i]);
//		}

		// 깊은복사 -> 우리가 원하는것. 원본가 복사본이 따로 따로
		char[] copy = new char[14]; // 새로운 배열을 만들어서
		for (int i = 0; i < origin.length; i++) { // 복사해줘야 한다
			if (i > 7) {
				copy[i] = '*';
			} else {
				copy[i] = origin[i];
			}
			System.out.print(copy[i]);
		}

		System.out.println("\n------원본출력------");

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}

	}

	public void exercise6() {
		int[] nums = { 1, 2, 3, 4, 5 };
//		for(int i=0; i<nums.length; i++) {
//			System.out.print(nums[i]+" ");
//		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}
	
	public void exercise7() {
		String[] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
//		for(int i=0; i<fruits.length; i++) {
//			System.out.print(fruits[i]+" ");
//		}
		for (String fruit : fruits) {
			System.out.print(fruit+" ");
		}
	}

	public static void main(String[] args) {
		Exercise_Array ex = new Exercise_Array();
//		ex.exercise1();
//		ex.exercise2();
//		ex.exercise3();
//		ex.exercise4();
//		ex.exercise5();
//		ex.exercise6();
		ex.exercise7();

	}

}
