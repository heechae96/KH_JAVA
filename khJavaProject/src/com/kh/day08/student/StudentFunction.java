package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {

//	Student student = new Student();
//
//	public StudentFunction() {
//		student = new Student();
//	}

	// 객체 배열을 활용
	Student[] students;

	public StudentFunction() {
		students = new Student[3];
	}

	public int printMenu() {
		System.out.println("====== 학생 성적 확인 프로그램 ======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("번호 입력: ");

		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();

		return menu;
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i + 1) + "번째 학생 정보 입력 ======");
			System.out.print("학생 이름: ");
			String name = sc.next();
			System.out.print("1차 점수: ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수: ");
			int secondScore = sc.nextInt();

			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}

	public void printScore() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("====== " + (i + 1) + "번째 학생 정보 출력 ======");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println(
					"1차 점수: " + students[i].getFirstScore() + ", 2차 점수: " + students[i].getSecondScore() + "입니다");
		}
	}

	public void checkPass() {

		try {	// 학생 정보를 입력하지 않고 재평가 여부를 확인하려고 하면 예외 발생!
			for (int i = 0; i < students.length; i++) {
				int num1 = students[i].getFirstScore();
				int num2 = students[i].getSecondScore();
				double avg = (num1 + num2) / (double) 2;

				System.out.println((i + 1) + "번째 " + students[i].getName() + " 학생의 확인 결과");

				if (avg >= 60) {
					// 예외 발생
					// ex) 1차 시험: 20점, 2차 시험: 100점
					// ex) 1차 시험: 100점, 2차 시험: 20점
					if (num1 < 40) {
						System.out.println("1차 시험 재평가 대상자입니다~");
					} else if (num2 < 40) {
						System.out.println("2차 시험 재평가 대상자입니다~");
					}
					System.out.println("통과입니다");
				} else {
					// 통과 하지 못한 사람들
					// ex) 1차 시험은 통과, 2차 시험은 낙제
					// ex) 1차 시험은 낙제, 2차 시험은 통과
					// ex) 1차, 2차 모두 낙제
					if (num1 < 60) {
						System.out.println("1차 시험 재평가 대상자입니다!");
					}
					if (num2 < 60) {
						System.out.println("2차 시험 재평가 대상자입니다!");
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("학생 정보를 먼저 입력하세요!!!");
		}

	}

	public void printGoodBye() {
		System.out.println("Good Bye~~~");
	}

	public void printException() {
		System.out.println("1~4사이의 수를 입력하세요!!!");
	}

}
