package com.kh.day06.exercise;

import java.util.Scanner;

// 구조적 프로그래밍
// 프로그램을 한 눈에 파악 가능
public class Exercise_ScoreProgram2 {

	// static 변수
	// 전역 변수, 클래스 변수
	static int kor = 0;
	static int eng = 0;
	static int math = 0;	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GOHOME:
		while (true) {
			printMenu();
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					inputScore();
					break;
				case 2:
					printScore();
					break;
				case 3:
					goodByeMsg();
					break GOHOME;
				default :
					printException();
					break;
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}

	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 성적 입력 =======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}

	public static void printScore() {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;

		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f \n", avg);
	}
	
	public static void goodByeMsg() {
		System.out.println("Good Bye~");
	}
	
	public static void printException() {
		System.out.println("1~3 사이의 수를 입력해주세요!");
	}

}
