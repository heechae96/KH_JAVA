package com.kh.day04.loop;

public class Exam_ForDouble {

	public static void main(String[] args) {

		// 중첩for문
		// 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
	}

}
