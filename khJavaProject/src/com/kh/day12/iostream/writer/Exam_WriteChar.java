package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {

		Writer writer = null;
		
		try {
			writer = new FileWriter("src/ioStream/fileWriter.txt");
			char[] cBuf = "자바가 제일 쉬웠어요".toCharArray();
			writer.write(cBuf);
			writer.flush();
			System.out.println("write(char[]) 동작완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
