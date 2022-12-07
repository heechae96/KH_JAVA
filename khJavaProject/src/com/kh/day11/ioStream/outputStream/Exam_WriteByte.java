package com.kh.day11.ioStream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {

		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/ioStream/outputStream.txt");
			byte[] data = "Real I/O".getBytes();
			os.write(data);
			os.flush();
			System.out.println("쓰기완료~!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
