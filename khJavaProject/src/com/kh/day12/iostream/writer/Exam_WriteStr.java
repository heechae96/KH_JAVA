package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {

		// 굳이 추상클래스인 Writer로 선언 안해도 된다
		// 확장성 때문에 최고조상 Writer로 하는것
		FileWriter writer = null;

		try {
			writer = new FileWriter("src/ioStream/fileWriter.txt");
			String data = "자바가 제일 쉬웠어요";
			writer.write(data);
			writer.flush();
			System.out.println("쓰기 완료!");
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
