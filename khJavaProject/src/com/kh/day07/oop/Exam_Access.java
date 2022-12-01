package com.kh.day07.oop;

class Sample{
	public int a;
	private int b;
	int c;
}

public class Exam_Access {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;	// public이므로 접근 가능
//		s.b = 10;	// private이므로 접근 불가능
		s.c = 10;	// default이므로 접근 가능
		
	}

}
