package com.kh.day12.iostream.bufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {

		// 버퍼 크기를 5로 하고, 표준 출력 스트림(System.out)과 연결한
		// 버퍼 출력 스트림을 생성하라!
		// /Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/text.txt파일을 저장된 영문
		// 텍스트를 읽어
		// 버퍼 출력 스트림을 통해 출력하라

		// 파일 입력용
		// 문자 스트림
		FileReader fir = null;
		int readChar;

		try {
			fir = new FileReader("/Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/text.txt");
			// 콘솔 출력용
			//										보조스트림   표준 스트림
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
			while ((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			bout.flush();
//			bout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
