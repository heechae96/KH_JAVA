package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String[] args) {

		/*
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 1
		 * 
		 * ====== 성적 입력 =======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 2
		 * 
		 * ====== 성적 출력 ======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30 
		 * 총점 : 120
		 * 평균 : 40.00
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 3 
		 * 
		 * Good Bye~
		 * 
		 */
		
		// if-else, switch-case 둘 다 쓰임
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// switch-case : if-else보다 빠르다
		GOHOME:	// 이름은 아무거나 가능 
		while (true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("====== 성적 입력 =======");
					System.out.print("국어 : ");
					kor = sc.nextInt();
					System.out.print("영어 : ");
					eng = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
					break;
				case 2:
					int sum = kor + eng + math;
					double avg = (double) sum / 3;
					System.out.println("====== 성적 출력 ======");
					System.out.println("국어 : " + kor);
					System.out.println("영어 : " + eng);
					System.out.println("수학 : " + math);
					System.out.println("총점 : " + sum);
					System.out.printf("평균 : %.2f \n", avg);
					break;
				case 3:
					System.out.println("Good Bye~");
					break GOHOME;
				default:
					System.out.println("1 ~ 3 사이의 수를 입력해주세요~");
					break;
			}
		}
		
		// if-else문
//		while (true) {
//			System.out.println("====== 메인 메뉴 =======");
//			System.out.println("1. 성적 입력");
//			System.out.println("2. 성적 출력");
//			System.out.println("3. 종료");
//
//			System.out.print("선택: ");
//			int input = sc.nextInt();
//
//			if (input == 1) {
//				System.out.println("====== 성적 입력 =======");
//				System.out.print("국어: ");
//				kor = sc.nextInt();
//				System.out.print("영어: ");
//				eng = sc.nextInt();
//				System.out.print("수학: ");
//				math = sc.nextInt();
//			} else if (input == 2) {
//				int sum = kor + eng + math;
//				double avg = (double) sum / 3;
//				System.out.println("====== 성적 출력 =======");
//				System.out.println("국어: " + kor);
//				System.out.println("영어: " + eng);
//				System.out.println("수학: " + math);
//				System.out.println("총점: " + sum);
//				System.out.printf("평균 : %.2f \n", avg);
//			} else if (input == 3) {
//				System.out.println("Good Bye~");
//				break;
//			} else {
//				System.out.println("1~3 사이의 수를 입력해주세요~");
//			}
//		}
	}

}
