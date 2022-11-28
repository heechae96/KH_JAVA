package com.kh.day04.loop;

public class Exam_ForDouble2 {

	public static void main(String[] args) {

		// 중첩for문
		// 별찍기
		// *****
		// *****
		// *****
		// *****
		// *****
		// *****

//		for (int i = 0; i < 5; i++) {
//			System.out.println("*****");
//		}

		for (int i = 0; i < 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
