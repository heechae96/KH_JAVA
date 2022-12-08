package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {

	public static void main(String[] args) {

		Reader reader = null;

		try {
			reader = new FileReader("src/ioStream/fileReader.txt");
			char[] cBuf = new char[3];
			reader.read(cBuf, 1, 2);	// cBuf에 저장된것중 인덱스 1부터 2개
			for(int i=0; i<cBuf.length; i++) {
				System.out.print(cBuf[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
