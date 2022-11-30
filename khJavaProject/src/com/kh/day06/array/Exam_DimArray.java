package com.kh.day06.array;

public class Exam_DimArray {

	public static void main(String[] args) {

//		int[][] arrs = new int[4][4];
//		int[][] arrs = new int[4][5];
		int[][] arrs = new int[5][3];
		System.out.println("행의 크기(앞): " + arrs.length);
		System.out.println("열의 크기(뒤): " + arrs[0].length);
		int k = 1;
		// 초기화
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%3d", arrs[i][j]);
			}
			System.out.println();
		}
	}

}
