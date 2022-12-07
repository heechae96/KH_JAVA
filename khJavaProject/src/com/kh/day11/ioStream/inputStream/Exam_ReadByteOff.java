package com.kh.day11.ioStream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {

		InputStream is = null;

		try {
			is = new FileInputStream("src/ioStream/inputStream.txt");
			int readByteNo;
			byte[] readBytes = new byte[8];
			//				read(byte[] b, int start_index, int length)
			readByteNo = is.read(readBytes, 2, 5);
			for (int i = 0; i < readBytes.length; i++) {
				System.out.println(readBytes[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
