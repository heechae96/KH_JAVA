package com.kh.day04.exercise;

public class Excercise_ForDouble {

	public static void main(String[] args) {

		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 오도록 하세요
		// 2*1=2 3*1=3 4*1=4

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j +"\t");
			}
			System.out.println();
		}
	}

}
