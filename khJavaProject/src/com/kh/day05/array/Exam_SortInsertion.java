package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortInsertion {

	public static void main(String[] args) {

		// 정렬 알고리즘
		// 1. 삽입 정렬
		// 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 0번에서 n-1번 인덱스까지 비교

		// j가 점점 커질때
		/*
		[2, 5, 4, 1, 3]
		[2, 5, 4, 1, 3]
		[2, 4, 5, 1, 3]
		[1, 4, 5, 2, 3]
		[1, 2, 5, 4, 3]
		[1, 2, 4, 5, 3]
		[1, 2, 4, 5, 3]
		[1, 2, 4, 5, 3]
		[1, 2, 3, 5, 4]
		[1, 2, 3, 4, 5]
		 */

		// j가 점점 작아질때
		/*
		 * [2, 5, 4, 1, 3] 
		 * [2, 4, 5, 1, 3] 
		 * [2, 4, 5, 1, 3] 
		 * [2, 4, 1, 5, 3] 
		 * [2, 1, 4, 5, 3] 
		 * [1, 2, 4, 5, 3] 
		 * [1, 2, 4, 3, 5] 
		 * [1, 2, 3, 4, 5] 
		 * [1, 2, 3, 4, 5] 
		 * [1, 2, 3, 4, 5]
		 */

		int[] arrs = { 2, 5, 4, 1, 3 };
//		System.out.println(Arrays.toString(arrs));
		for (int i = 1; i < arrs.length; i++) {
			for (int j = 0; j < i; j++) {	
				if (arrs[i] < arrs[j]) {
					int tmp = arrs[j];
					arrs[j] = arrs[i];
					arrs[i] = tmp;
				}
//				System.out.println(Arrays.toString(arrs));
			}
//			for (int j = i; j > 0; j--) {
//				if (arrs[j - 1] > arrs[j]) {
//					int temp = arrs[j - 1];
//					arrs[j - 1] = arrs[j];
//					arrs[j] = temp;
//				}
//				System.out.println(Arrays.toString(arrs));
//			}
		}
		System.out.println(Arrays.toString(arrs));

	}

}
