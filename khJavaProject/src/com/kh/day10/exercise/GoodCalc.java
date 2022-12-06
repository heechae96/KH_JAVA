package com.kh.day10.exercise;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {

		GoodCalc gc = new GoodCalc();
		System.out.println(gc.add(10, 3));
		System.out.println(gc.subtract(10, 3));
		System.out.println(gc.average(new int[]{1,3,5,7,9}));
		
	}

}
