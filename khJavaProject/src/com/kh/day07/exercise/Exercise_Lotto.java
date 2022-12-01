package com.kh.day07.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise_Lotto {

	public static void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		int[] lottoNums = new int[6];
		Random rand = new Random();

//		int[] lottoArr = new int[45];
//		for (int i = 0; i < lottoArr.length; i++) {
//			lottoArr[i] = i + 1;
//		}
//		System.out.println("섞기전!!!!");
//		System.out.println(Arrays.toString(lottoArr));
//
//		for (int i = 0; i < lottoArr.length; i++) {
//			int idx = rand.nextInt(45); // 0 ~ 44
//
//			int tmp = lottoArr[i];
//			lottoArr[i] = lottoArr[idx];
//			lottoArr[idx] = tmp;
//		}
//		System.out.println("섞은후!!!!");
//		System.out.println(Arrays.toString(lottoArr));
//
//		for (int i = 0; i < lottoNums.length; i++) {
//			lottoNums[i] = lottoArr[i];
//		}
//
//		System.out.println("정렬전 로또 번호");
//		System.out.println(Arrays.toString(lottoNums));
		
		// 번호를 뽑는다. X 6
		for(int i = 0; i < lottoNums.length; i++) {
			// 번호를 뽑는다.
			// 1 ~ 45 -> 0 ~ 44 -> 1 ~ 45
			lottoNums[i]  = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				// 비교를 한다. 점점 많아진다.
				// 비교는 이미뽑은 것과 첫번째부터~
				if(lottoNums[i] == lottoNums[e]) {
					// 같으면 i--;
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < lottoNums.length - 1; i++) {	// 버블정렬 
			for (int j = 0; j < lottoNums.length - 1 - i; j++) {
				if (lottoNums[j] > lottoNums[j + 1]) {
					int tmp = lottoNums[j];
					lottoNums[j] = lottoNums[j + 1];
					lottoNums[j + 1] = tmp;
				}
			}
		}

		System.out.println("오름차순 로또 번호");
		System.out.println(Arrays.toString(lottoNums));

	}

	public static void main(String[] args) {

		lottoProgram();

	}

}
