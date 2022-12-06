package com.kh.day10.wrapperEx;

public class Exam_Wrapper {

	public static void main(String[] args) {
		// Wrapper 객체로부터 기본 타입 값 알아내기
		// The constructor Integer(int) is deprecated since version 9
		// Integer i = new Integer(123);
		
		Integer i = Integer.valueOf(123);	// 객체로 만들어서 사용
		int e = i.intValue();				// 기본형으로 변환
		
		Integer f = null;
		// int m = null;					// Type mismatch: cannot convert from null to int
		
		Character c = Character.valueOf('c');	// 객체
		char ch = c.charValue();				// 기본형
		
		Double d = Double.valueOf(3.14);		// 객체
		double dd = d.doubleValue();			// 기본형
		
		// 문자열을 기본 데이터 타입(int, boolean, double)으로 변환
		int num = Integer.parseInt("312");
		int result = num + 1;
		System.out.println("변환된값: " + num);
		boolean isYn = Boolean.parseBoolean("true");
		double fnum = Double.parseDouble("3.14");
		
		// 기본 데이터 타입(int, double, char)을 문자열로 변환
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123);	// 16진수 7b
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		
		
	}

}
