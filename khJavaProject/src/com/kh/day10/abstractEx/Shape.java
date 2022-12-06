package com.kh.day10.abstractEx;

// The type Line must implement the inherited abstract method Shape. draw()
abstract class Line extends Shape{
	
}

//class Line extends Shape {
//
//	@Override
//	public void draw() {
//	}
//
//}

// The type Shape must be an abstract class to define abstract methods
abstract public class Shape {
	public Shape() {
	}

	public void paint() {
	}

	// The abstract method draw in type Shape can only be defined by an abstract
	// class
	abstract public void draw();
}
