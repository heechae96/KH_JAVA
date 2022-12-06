package com.kh.day10.zooInterface;

public class Tiger extends Animal implements Predator {
	@Override
	public String animalFood() {
		return "beef";
	}
}
