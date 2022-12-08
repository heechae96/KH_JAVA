package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {

		Reader reader = null;
		
		try {
			reader = new FileReader("src/ioStream/fileReader.txt");	// 자바/오라클/JDBC
			char[] chBuf = new char[2];
			String data = "";
			while(true) {
				int readCharNo = reader.read(chBuf);	// read(char[])이 들어간 경우. 읽은 개수를 반환
				if(readCharNo == -1) break;
				data += new String(chBuf, 0, readCharNo);
			}
			// data cannot be resolved to a variable
			// Unreachable code
			System.out.println(data);	// 자바
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();	// 잊지 않고 스트림 닫아줄것
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
