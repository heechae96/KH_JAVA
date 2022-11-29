package com.kh.day05.run;

// 사용할 클래스의 위치가 어디인지 알려줘야 한다.
import com.kh.day05.exercise.Exercise_For;
import com.kh.day05.exercise.Exercise_While;

public class Run {

	public static void main(String[] args) {

		Exercise_For exFor = new Exercise_For();	// import로 위치 알려줘서 가능
		exFor.exercise1();
//		exFor.exercise2();
//		exFor.exercise3();
//		exFor.exercise4();
		
		Exercise_While exWhile = new Exercise_While();
		exWhile.exercise1();
//		exWhile.exercise2();
//		exWhile.exercise3();	// private이라 호출 불가
	}

}
