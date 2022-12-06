package com.kh.day09.overloading;

class Weapon {
	// 생성자의 오버로딩
	public Weapon() {
	}

	public Weapon(int value) {
		System.out.println(value);
	}

	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}

	protected int fire() {
		return 1;
	}

	// 오버로딩
	// 자기 자신이게 복붙
	// 매개변수 타입 or 갯수가 달라짐
	protected int fire(int steampack) {
		return steampack * 100;
	}

	// 오버로딩
	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}

	// 오버로딩
	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
}

class Cannon extends Weapon {
	// 오버라이딩
	@Override
	protected int fire() {
		return 10;
	}
}

public class MethodOverloadingEx {

	public static void main(String[] args) {

		// println도 오버로딩의 하나
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}

}
