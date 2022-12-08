package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Exercise_IOStream {

	public static void fileCopy() {
		// 이미지 파일 복사해오기
		// /Users/shinheechae/Downloads/moomeokpan.png
		// /Users/shinheechae/Desktop/randomFood.png

		// 이미지: 이진데이터
		// -> 바이트 기반 스트림 사용

		// 만들어진 이미지를 가져올때: 입력 스트림 사용
		// 가져온 이미지를 붙여넣을때 : 출력 스트림 사용

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("/Users/shinheechae/Downloads/moomeokpan.png");
			os = new FileOutputStream("/Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/randomFood.png");
			byte[] readBytes = new byte[100]; // 크기는 상관없음
			int readByteNo;
			while ((readByteNo = is.read(readBytes)) != -1) {	// 파일 읽기 성공
				os.write(readBytes, 0, readByteNo);	// 파일 붙여넣기 성공
//				System.out.println(Arrays.toString(readBytes));
			}
			System.out.println("복사 완료!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		fileCopy();
	}

}
