package com.kh.day03.typeTrans;

public class TestTypeTrans1 {

	public static void main(String[] args) {

		// 자동 형변환
		int iNum = 10;
		double dNum = 13.2;
		double result = iNum + dNum;
		System.out.println(result);	// 23.2
		
		// 강제 형변환
		System.out.println("강제 형변환: " + (int)3.14);	// 3
		System.out.println("강제 형변환: " + (char)65);		// A
	}

}
