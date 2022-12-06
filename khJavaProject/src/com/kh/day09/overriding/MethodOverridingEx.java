package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {

		Line line = new Line();
//		line.draw();
		paint(line);			// 오버라이딩 했음.	동적바인딩 발생
		paint(new Rect());		// 오버라이딩 안했음. 동적바인딩 발생 x -> 조상 메소드 출력
		paint(new Circle());	// 오버라이딩 했음.	동적바인딩 발생 
	}

}
