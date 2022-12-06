package com.kh.day10.musicInterface;

public class Guitar implements Instrumnet{
	@Override
	public void play() {
		System.out.println("CDEFGAB");
	}
	
	@Override
	public void makeSound() {
		System.out.println("BAGFEDC");
	}
}
