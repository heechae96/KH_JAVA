package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("=====동전 앞 뒤 맞추기=====");
		System.out.print("숫자를 입력해주세요(1.앞면, 2.뒷면) :");
		int choice = sc.nextInt();
		
		// computer변수에는 1또는 2의 값이 랜덤하게 들어가야 함
		int computer = rand.nextInt(2)+1;
		
		System.out.println(computer);
		
		if(choice==computer) {
			System.out.println("정답입니다");
		}else {
			System.out.println("틀렸습니다");
		}
	}

}
