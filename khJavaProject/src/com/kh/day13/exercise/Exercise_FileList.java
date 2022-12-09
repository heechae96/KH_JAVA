package com.kh.day13.exercise;

import java.io.File;

public class Exercise_FileList {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다-----");
		File[] subFiles = dir.listFiles();
		for (int i = 0; i < subFiles.length; i++) {
			File fOne = subFiles[i];
			long time = fOne.lastModified();
			System.out.printf("%30s", fOne.getName());
			System.out.print("\t파일 크기: " + fOne.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", time, time, time, time);	// 월 일 요일 시간
		}
	}

	public static void main(String[] args) {

		File file = new File("/Users/shinheechae");
		System.out.println(file.getPath() + ", " + file.getParent() + ", " + file.getName());
		listDirectory(file);
	}
}
