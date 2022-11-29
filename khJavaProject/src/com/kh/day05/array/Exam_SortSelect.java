package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortSelect {

	public static void main(String[] args) {
		// 정렬 알고리즘
		// 2. 선택 정렬
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함
		// 특징: 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 		데이터 양이 많을 때 급격한 성능 저하를 보임
		
		int[] arrs = {2,5,4,1,3};
		int min;
		for(int i=0; i<arrs.length; i++) {
			min = i;	// 가장 작을 때 인덱스 값
			
			for(int j=i+1; j < arrs.length; j++) {	// 최소값 찾기
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int tmp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = tmp;
//			System.out.println(Arrays.toString(arrs));
		}
		System.out.println(Arrays.toString(arrs));
		
	}

}
