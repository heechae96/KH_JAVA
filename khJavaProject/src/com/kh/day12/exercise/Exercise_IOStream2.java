package com.kh.day12.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream2 {

	public static void memoFIleMake() {
		/*
		 * 저장할 파일명 입력 : khText.txt
		 * 'khText.txt' 파일에 저장될 내용 입력
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit은 제외하고 저장)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		
		Writer writer = null;
		int i = 1;
		try {
			writer = new FileWriter("/Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/"+fileName);
			while(true) {
				System.out.print(i + " : ");
//				String str = sc.next();
				String str = sc.nextLine();
				if("exit".equals(str)) break;
				writer.write(str+"\n");
				i++;
			}
			System.out.println("파일 저장 완료");
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
	
	public static void main(String[] args) {
		memoFIleMake();
	}

}
