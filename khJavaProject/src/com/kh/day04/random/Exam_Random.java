package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {

		// 랜덤함수
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			// nextInt(n)
			// 0부터 n-1까지의 랜덤한 수
			
			// 0~9
			System.out.println(rand.nextInt(10));
			// 1~10
//			System.out.println(rand.nextInt(10) + 1);
			
		}
	}

}
