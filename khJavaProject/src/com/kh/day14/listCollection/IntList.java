package com.kh.day14.listCollection;

import java.util.Arrays;

public class IntList {
	// 배열의 단점 : 1. 한번 크기를 지정하면 변경 할 수 없다
	// resize()로 보완

	private int[] nums; 
	private int size;	// 요소의 개수

	public IntList() {
		nums = new int[3];
		size = 0;
	}

	public void add(int input) {
		// int input = 3
		// 배열이 다 채워진 상태라면 크기 재할당 배열 생성
		if (size == nums.length) {
			resize();
		}
		nums[size] = input;
		size++;
	}

	private void resize() {
		int array_capacity = nums.length;
		
		// 용량이 꽉 찰 경우
		if(size==array_capacity) {
			// 용량을 2배로 해줌
			int new_capacity = array_capacity * 2;
			// 새롭게 배열을 만들어줌
			nums = Arrays.copyOf(nums, new_capacity);	// (복사할 배열, 새로 할당할 배열의 크기)
		}
	}

	public int get(int index) {
		return nums[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		nums = new int[3];
		size = 0;
	}
	
}
