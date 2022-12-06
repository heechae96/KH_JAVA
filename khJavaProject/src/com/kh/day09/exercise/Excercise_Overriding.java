package com.kh.day09.exercise;

class SuperClass {
	void paint() {	// 3. 실행
		draw();	// 4. 동적 바인딩으로 오버라이딩된 메소드 찾아 호출
	}

	void draw() {
		System.out.println("Super Object");	// 7. 직접 호출되어 실행
	}
}

class SubClass extends SuperClass {
	@Override
	void paint() {	// 1. 동적 바인딩으로 오버라이딩된 메소드 호출(ex.print())
		super.paint();	// 2. 호출
		super.draw();	// 6. 호출. 컴파일러는 super의 접근을 정적 바인딩으로 처리
	}

	@Override
	void draw() {
		System.out.println("Sub Object");	// 5. 동적 바인딩으로 인해 이 메서드가 실행
	}
}

public class Excercise_Overriding {

	public static void main(String[] args) {

		SuperClass ex = new SubClass();	// 조상 타입으로 자손 타입 참조해서 다형성.
										// 업캐스팅 된 것
		ex.paint();						// 부모타입 변수 ex
	}

}
