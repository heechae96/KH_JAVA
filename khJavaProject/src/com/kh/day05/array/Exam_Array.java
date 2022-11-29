package com.kh.day05.array;

public class Exam_Array {

	public static void main(String[] args) {
	
		int num = 0;
		// 좌변은 배열의 선언
		// 우변은 배열의 할당
		int[] nums = new int[10];
		System.out.println(nums[0]);
		// 배열의 초기화
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("첫번째 값: "+nums[0]);
		System.out.println("두번째 값: "+nums[1]);
		System.out.println("세번째 값: "+nums[2]);
		System.out.println("배열의 크기: " + nums.length);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

		for(int i=0; i<nums.length; i++) {
			nums[i] = 100;
			System.out.println(nums[i]);
		}
		
	}

}
