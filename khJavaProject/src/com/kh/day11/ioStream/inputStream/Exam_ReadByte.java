package com.kh.day11.ioStream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Exam_ReadByte {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("src/ioStream/inputStream.txt"); // 다형성. 업캐스팅
			int readByteNo;
			byte[] readBytes = new byte[3];
			String data = "";
			while ((readByteNo = is.read(readBytes)) != -1) {
				// read() : 읽은걸 반환
				// read(byte[] bytes) : 읽은 개수를 반환
				// readBytes에 데이터가 들어가있다
				
				// readByteNo = is.read(readBytes);
				// if (readByteNo == -1) break;
				
				// 			String(byte[] byte_arr, int start_index, int length)
				data += new String(readBytes, 0, readByteNo);
			}
//			while (true) {
//				// read() : 읽은걸 반환
//				// read(byte[] bytes) : 읽은 개수를 반환
//				// readBytes에 데이터가 들어가있다
//				// System.out.println(Arrays.toString(readBytes));
//				readByteNo = is.read(readBytes);
//				if (readByteNo == -1) break;
//				
//				// 			String(byte[] byte_arr, int start_index, int length)
//				data += new String(readBytes, 0, readByteNo);
//			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
