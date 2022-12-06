package com.kh.day10.zooInterface;

public class Bear extends Animal implements Predator{
	@Override
	public String animalFood() {
		return "salmon";
	}
}
