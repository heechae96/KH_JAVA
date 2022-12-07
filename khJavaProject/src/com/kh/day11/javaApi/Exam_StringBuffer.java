package com.kh.day11.javaApi;

public class Exam_StringBuffer {

	public static void main(String[] args) {

		// StringBuffer : 문자열을 연결해주는 클래스
		// 문자열을 연결해주는 메소드 : concat()
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");

		System.out.println("연결된 문자열: " + sb.toString());

		// 메소드체이닝 가능
		// 자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것
		StringBuffer stb = new StringBuffer().append("KH").append(" Java Class").append(" F class").append(" Hot");
		System.out.println("연결된 문자열: " + stb.toString());
		
	}

}
