package com.kh.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {

		// 논리연산자

		// ex)
		// 남자이면서 평균 평점 4.3이상인 사람 -> AND
		// 컴퓨터공학과 또는 경영학과인 사람 -> OR

		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; // 변수의 선언

		result1 = (num1 != num2) && (num1 < num2);	// t f f
		System.out.println("result1의 결과값: " + result1);

		result2 = (num1 < num2) && (num1 == num2);	// f
		System.out.println("result2의 결과값: " + result2);

		result3 = (num1 > num2) || (num1 != num2);	// t
		System.out.println("result3의 결과값: " + result3);

		result4 = (num1 > num2) || (num1 == num2);	// t
		System.out.println("result4의 결과값: " + result4);
		
		System.out.println("------------------------------------");
		
		int aNum = 70;
		int bNum = 55;
		result1 = (aNum == bNum) || (aNum++ < 100);		// f t t
		result2 = (aNum < bNum) && (--bNum < 55);		// f
		result3 = (aNum != bNum) && (bNum-- < aNum++);	// t t t
		result4 = (aNum++ != bNum) || (bNum++ >= 85);	// t
		System.out.println("result1의 결과값: " + result1);
		System.out.println("result2의 결과값: " + result2);
		System.out.println("result3의 결과값: " + result3);
		System.out.println("result4의 결과값: " + result4);

	}

}
