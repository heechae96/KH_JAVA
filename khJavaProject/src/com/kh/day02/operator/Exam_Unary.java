package com.kh.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {

		// 연산자
		
		// 단항연산자
		// a++, a--, b++, b--
		// ++a, --a, ++b, --b
		// a = a + 1, a = a - 1, b = b + 1, b = b - 1
		int a = 1;
		System.out.println(a++);	// 후위연산(나중연산)
		System.out.println(a);
		System.out.println(++a);	// 전위연산(먼저연산)
		
		/*
		 * Q1. a는 10이고, b는 20, c는 30이라고 했을 때
		 * 		a++;
		 * 		b = (--a) + b;
		 * 		c = (a++) + (--b);
		 * 의 연산을 했을때 a,b,c의 값을 각각 얼마인가?
		 * 
		 * Q2. x는 100이고, y는 33, z는 0일때,
		 * 		x--;
		 * 		z = x-- + --y;
		 * 		x = 99 + x++ + x;
		 * 		y = y-- + y + ++y;
		 * 	의 연산을 했을 때 x,y,z의 값을 각각 얼마인가?
		 */
		
		// a는 11
		// b = 10 + 20	// a는 10, b는 30
		// c = 10 + 29  // a는 11, c = 39, b는 29
		
		// x는 99
		// z = 99 + 32 			// x는 98, y는 32, z는 131
		// x = 99 + 98 + 99		// x는 296
		// y = 32 + 31 + 32		// y는 95
		
		a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " +c);
		
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		
		boolean result = true;
		System.out.println("result의 값은: " + result);
		System.out.println("!result의 값은: " + !result);
	}

}
