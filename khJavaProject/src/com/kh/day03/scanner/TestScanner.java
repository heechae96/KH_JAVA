package com.kh.day03.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		/*
		이름을 입력해주세요. // next()
		신희채
		태어난 월을 입력해주세요.
		1
		키를 입력해주세요.
		172
		성별을 입력해주세요.
		남
		주소를 입력해주세요. // nextLine()
		서울시 영등포구
		
		이름은 신희채입니다.
		태어난 월은 1입니다.
		키는 172.0입니다.
		성별은 남입니다.
		주소는 서울시 영등포구입니다.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요. ");
		String name = sc.next();
		
		System.out.println("태어난 월을 입력해주세요. ");
		int month = sc.nextInt();
		
		System.out.println("키를 입력해주세요. ");
		double tall = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요. ");
		char sex = sc.next().charAt(0);
		
		System.out.println("주소를 입력해주세요. ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "입니다.");
		System.out.println("키는 " + tall + "입니다.");
		System.out.println("성별은 " + sex + "입니다.");
		System.out.println("주소는 " + addr + "입니다.");
		
	}

}
