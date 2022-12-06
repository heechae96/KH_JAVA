package com.kh.day10.interfaceEx;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("뚜루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}
	
	@Override
	public void printLogo() {
		System.out.println("==== Samsung ====");
	}

	public void flash() {
		System.out.println("반짝반짝 불이 켜졌습니다");
	}

}
