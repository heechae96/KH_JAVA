package com.kh.day11.ioStream.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {

		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/ioStream/outputStream.txt");
			byte[] data = "JAVAscript".getBytes();
			// write(data[] data, int start_index, int length)
			os.write(data, 4, 6);
			os.flush();
			System.out.println("Write 완료~");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
