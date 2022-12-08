package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {

		Writer writer = null;
		
		try {
			writer = new FileWriter("src/ioStream/fileWriter.txt");
			// write(char[])
			char[] data = "스프링&클라우드 웹 개발자 양성과정".toCharArray();	// 문자열 -> 문자 배열
			for(int i=0; i<data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();	// 남은 버퍼 비우고
			System.out.println("쓰기완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();	// 스트림 닫는다
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
