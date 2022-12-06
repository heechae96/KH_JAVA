package com.kh.day10.musicInterface;

public class Musician {
	// 오버로딩
	// 매개변수만 계속 바뀌는거 같은데?
//	public void playInstrument(Piano piano) {
//		piano.play();
//	}
//	
//	public void playInstrument(Guitar guitar) {
//		guitar.play();
//	}
//	
//	public void playInstrument(Drum drum) {
//		drum.play();
//	}
	
	// Piano, Guitar, Drum이 인터페이스를 구현하도록 함
	// -> 매개변수를 인터페이스로 설정하면 Piano, Guitar, Drum를 받을 수 있다
	public void playInstrument(Instrumnet instrumnet) {
		instrumnet.play();
	}

}
