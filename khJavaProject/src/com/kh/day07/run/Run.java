package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {

//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walking();
////		person.name = "일용자";		// private으로 선언해서 접근 불가.
////		person.jobName = "의사";

		Scanner sc = new Scanner(System.in);
		// 래퍼런스 변수(참조 변수) 선언
		//	-> 주소가 저장되는 변수
		Rectangle rec = new Rectangle();	// 객체 생성, 반드시 new 키워드 이용
											// new는 객체의 생성자 호출
		System.out.print("높이를 입력해주세요: ");
		rec.height = sc.nextInt();
		System.out.print("너비를 입력해주세요: ");
		rec.width = sc.nextInt();
		int result = rec.getArea();
		System.out.println("사각형의 면적은: " + result);
	}

}
