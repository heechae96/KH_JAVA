package com.kh.day11.wrapperEx;

public class Exam_BoxingUnBoxing {

	public static void main(String[] args) {

		Integer num = Integer.valueOf(0);
		
		// Boxing(자동박싱)
		Integer su = 100;
		
		// unBoxing(자동 언박싱)
		int soo = num.intValue();
		soo = num;
		
		int n = 10;
		Integer intObj = n;
		System.out.println("intObj: " + intObj);
		
		int m = intObj + 10;
		System.out.println("m = " + m);
	}

}
