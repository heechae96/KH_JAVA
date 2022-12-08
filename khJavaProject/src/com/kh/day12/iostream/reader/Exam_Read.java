package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {

		// 바이트 기반 스트림
		InputStream is = null;

		// 문자 기반 스트림
		Reader reader = null;
		try {
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/ioStream/fileReader.txt"); // 자바/오라클/JDBC
			while (true) {
				// Unhandled exception type IOException
				int readData = reader.read();
				if (readData == -1) break;
				// System.out.println(readData); // 숫자
				System.out.print((char) readData); // 문자
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	// 반드시 실행되어야 하는 코드 블럭
			try {
				// Unhandled exception type IOException
				// 예외가 발생한 경우 작업을 못하는데 스트림이 열려있으면 낭비
				reader.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}

}
