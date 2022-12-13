package com.kh.day14.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {

	// 1. 정보입력
	// 2. 정보출력
	// 3. 정보저장(save)
	// 4. 정보불러오기(load)
	// 0. 종료
	// 메뉴 입력 : 1
	//
	// 이름 입력 : 일용자
	// 나이 입력 : 33
	// 주소 입력 : 서울시 종로구
	//
	// 1. 정보입력
	// 2. 정보출력
	// 3. 정보저장(save)
	// 4. 정보불러오기(load)
	// 0. 종료
	// 메뉴 입력 : 2
	//
	// 이름 : 일용자
	// 나이 : 33
	// 주소 : 서울시 종로구
	//
	// 3. 선택하여 저장 후 파일을 열어보면
	// 단, 파일의 이름은 이름으로 한다.
	// 일용자.txt -> 일용자/33/서울시 종로구
	// 이용자.txt -> 이용자/22/서울시 중구
	// 삼용자.txt -> 삼용자/11/서울시 서대문구
	//
	// 4. 선택 후 파일의 제목을 입력하여 로드한 후에
	// 2. 선택하면 정보가 출력됨
	//
	// 이름 : 이용자
	// 나이 : 22
	// 주소 : 서울시 중구

	Info info;

	public Exercise_IOStream() {
		info = new Info();
	}

	public int printMenu() {
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장(save)");
		System.out.println("4. 정보불러오기(load)");
		System.out.println("0. 종료");
		System.out.print("메뉴 입력 : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		sc.nextLine();

		return num;
	}

	public void insertInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력: ");
		String addr = sc.nextLine();
		System.out.println("==============================================");

		info = new Info(name, age, addr);
	}

	public void printInfo() {
		System.out.println("이름: " + info.getName());
		System.out.println("나이: " + info.getAge());
		System.out.println("주소: " + info.getAddr());
		System.out.println("==============================================");
	}

	public void save() {
		String fileName = info.getName();
		Writer writer = null;

		try {
			writer = new FileWriter(
					"/Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/file/" + fileName + ".txt"); // 파일 생성
			String data = info.getName() + "/ " + info.getAge() + "/ " + info.getAddr();
			writer.write(data);
			System.out.println("================ 저장 완료 ================");
			writer.flush();	// close()안해주려면 반드시 flush필요!
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

	public void load() {
		Reader reader = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("파일의 제목 >> ");
		String fileName = sc.next();
		BufferedReader bfReader = null;
		String result = "";

		try {
			reader = new FileReader(
					"/Users/shinheechae/git/KH_edu/khJavaProject/src/ioStream/file/" + fileName + ".txt");
			
			bfReader = new BufferedReader(reader);	// reader.read()로 받으면 복잡함
			result = bfReader.readLine();
			
//			// 방법1) split()
//			String[] splStr = result.split("/ ");
//			// System.out.println(Arrays.toString(splStr));
//			info = new Info(splStr[0], Integer.parseInt(splStr[1]), splStr[2]);
//			System.out.println("================ 로드 완료 ================");
			
			// 방법2) StringTokenizer
			StringTokenizer st = new StringTokenizer(result, "/");
//			StringTokenizer st = new StringTokenizer(result, "/ ");	// 주소 중간에 공백때문에 뒷 부분이 날라감
			info = new Info(st.nextToken(), Integer.parseInt(st.nextToken().trim()), st.nextToken().trim());
//			while(st.hasMoreTokens()) {
//				System.out.println(st.nextToken());
//			}
			System.out.println("================ 로드 완료 ================");
			System.out.println("정보 출력이 가능합니다. 2번을 눌러주세요!!!");
			System.out.println("===========================================");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
