package com.kh.day11.ioStream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {

		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/ioStream/outputStream.txt");
			// "Hello I/O"
			byte[] data = "Hello I/O".getBytes();
			for(int i=0; i<data.length; i++) {
				os.write(data[i]);
			}
			os.flush();	// 읽을때와 다르게 쓸때는 버퍼를 한번 비워야 한다
			System.out.println("쓰기완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
