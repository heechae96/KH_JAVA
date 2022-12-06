package com.kh.day10.musicInterface;

public class Drum implements Instrumnet{
	@Override
	public void play() {
		System.out.println("둥둥타 두두둥");
	}
	
	@Override
	public void makeSound() {
		System.out.println("두두둥 둥둥탁");
	}
}
