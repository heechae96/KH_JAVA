package com.kh.day03.typeTrans;

public class TestTypeTrans2 {

	public static void main(String[] args) {

		byte b = 127;	// 1바이트
		int i = 100;	// 4바이트
		
		// 자동 형변환
		System.out.println(b+i);	// b는 4바이트 정수형으로 자동 형변환
		System.out.println(10/4);
		System.out.println(10.0/4);	// 4는 4.0(실수)로 자동 형변환
		
		// 강제 형변환
		// 데이터 손실 가능성!
		System.out.println(b+i);
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9 + (int)1.8);
	}

}
