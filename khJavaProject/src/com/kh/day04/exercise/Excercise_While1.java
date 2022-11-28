package com.kh.day04.exercise;

public class Excercise_While1 {

	public static void main(String[] args) {

		// while문을 이용하여 1~100사이의 홀수의 합을 출력하세요
		int i = 1;
		int sum = 0;
		while (i < 100) {
//			System.out.println(i);
			sum += i;
			i += 2;
		}

		System.out.println("1~100사이의 홀수의 합: " + sum);
	}

}
