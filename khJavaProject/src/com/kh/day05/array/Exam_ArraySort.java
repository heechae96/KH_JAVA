package com.kh.day05.array;

import java.util.Arrays;

public class Exam_ArraySort {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int tmp;
		
		System.out.printf("num1: %d, num2: %d\n",num1,num2);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.printf("num1: %d, num2: %d\n",num1,num2);
		
		int[] nums = {2,1,3};
		System.out.println(Arrays.toString(nums));
		
		// nums가 1,2,3이 되도록
		tmp = nums[0];
		nums[0] = nums[1];
		nums[1] = tmp;
		System.out.println(Arrays.toString(nums));
		
		// nums가 3,2,1이 되도록
		tmp = nums[0];
		nums[0] = nums[2];
		nums[2] = tmp;
		System.out.println(Arrays.toString(nums));
	}

}
