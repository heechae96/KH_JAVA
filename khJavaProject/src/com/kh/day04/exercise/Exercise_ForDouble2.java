package com.kh.day04.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {

		// 0시 0분부터 23시59분까지 출력하기
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분%n", i, j);
			}
			System.out.println();
		}
	}

}
