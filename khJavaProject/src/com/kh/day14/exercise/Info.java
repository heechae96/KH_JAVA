package com.kh.day14.exercise;

public class Info {

	private String name; // 이름
	private int age; // 나이
	private String addr; // 주소

	public Info(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Info() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
