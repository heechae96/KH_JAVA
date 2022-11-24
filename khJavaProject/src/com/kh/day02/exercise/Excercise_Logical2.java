package com.kh.day02.exercise;

public class Excercise_Logical2 {

	public static void main(String[] args) {

		// 문자 A가 대문자인지 소문자인지 확인하세요
		// 단, A라는 문자는 변수 word에 초기화 해주세요
		// 영어 대문자 확인 : true

		char word = 'A';
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);

	}

}
