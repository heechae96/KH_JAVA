package com.kh.day06.exercise;

public class Exercise_DimArray {

	public void exercise1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 12
		// 20 19 18 17 16
		// 25 24 23 22 21
		int[][] numArr = new int[5][5];
		int num = 1;
		for (int i = 0; i < numArr.length; i++) {
//			for (int j = 0; j < numArr[i].length; j++) {
//				numArr[i][j] = num;
//				num--;
//			}
//			num += 10;
			for (int j = numArr.length - 1; j >= 0; j--) {
				numArr[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int[][] numArr = new int[5][5];
		int num = 1;
		for (int i = 0; i < numArr.length; i++) {
//			for (int j = 0; j < numArr[i].length; j++) {
//				numArr[i][j] = num;
//				num += 5;
//			}
//			num = 5 - (i+1);
			for (int j = numArr.length - 1; j >= 0; j--) {
				numArr[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int[][] numArr = new int[5][5];
		int num = 1;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int[][] numArr = new int[5][5];
		int num = 1;
		for (int i = 0; i < numArr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < numArr[i].length; j++) {
					numArr[i][j] = num;
					num++;
				}
			} else {
				for (int j = numArr.length - 1; j >= 0; j--) {
					numArr[i][j] = num;
					num++;
				}
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.printf("%3d", numArr[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라
		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };	// 4 * 2
		double sum = 0;
		int cnt = 0;
		double avg = 0;
		
		// 총합 구하기
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				cnt++;
			}
		}
		
		// 평균구하기
		avg = sum/cnt;
		System.out.println("평균은: " + avg);
		
	}

	public static void main(String[] args) {

		Exercise_DimArray ex = new Exercise_DimArray();
		System.out.println("=========1번=========");
		ex.exercise1();
		System.out.println("=========2번=========");
		ex.exercise2();
		System.out.println("=========3번=========");
		ex.exercise3();
		System.out.println("=========4번=========");
		ex.exercise4();
		System.out.println("=========5번=========");
		ex.exercise5();
	}

}
