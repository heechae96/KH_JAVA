package com.kh.day10.interfaceEx;

public interface PhoneInterface {

	public String name = "";	// static final이 생략된것. 상수
	
	//	public static final int TIME_OUT = 10000;	// 상수
	int TIME_OUT = 10000;	// 상수				// public static final 생략 가능

	//	public abstract void sendCall();			// 추상메소드
	void sendCall();			// 추상메소드	// public abstract 생략 가능

	//	public abstract void receiveCall();			// 추상메소드
	void receiveCall();			// 추상메소드	// public abstract 생략 가능
	
	public default void printLogo() {			// default메소드
		// 하위 호완성을 위해 작성
		// 즉, 하위 호완성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
