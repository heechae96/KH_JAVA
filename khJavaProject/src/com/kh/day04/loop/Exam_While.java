package com.kh.day04.loop;

public class Exam_While {

	public static void main(String[] args) {

		// while(조건식){실행내용;}
		// 1부터 9까지 출력하는 예제
		int i = 1;
		while (i < 10) {
			System.out.print(i);
			i++;
		}
		
		System.out.println();
		
		// 9부터 1까지 출력하는 예제
		int j = 9;
		while(j>0) {
			System.out.print(j);
			j--;
		}
	}

}
