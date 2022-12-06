package com.kh.day10.musicInterface;

public class StageRun {

	public static void main(String[] args) {

		Musician musician = new Musician();
		
//		public void playInstrument(Instrumnet instrumnet) {
//			instrumnet.play();
//		}

		musician.playInstrument(new Piano());
		musician.playInstrument(new Guitar());
		musician.playInstrument(new Drum());
	}

}
