package com.kh.day09.point;

public class Point { // ColorPoint의 부모 역할 
	private int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
