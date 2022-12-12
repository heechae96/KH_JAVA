package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {

		Socket socket = null;
		String addr = "127.0.0.1";
		int port = 8989;

		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(addr, port);
			System.out.println("서버와 연결되었습니다");

			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// 1. 입력 받기
				// 계산식(빈칸으로 띄어 입력, 예시) 12 + 1)
				// 계산 결과 : 13
				System.out.print("계산식(빈칸으로 띄어 입력, 예시) 12 + 1) >> ");
				String msg = sc.nextLine();

				// 2. 보내기
				dos.writeUTF(msg);
				if(msg.equalsIgnoreCase("bye")) {
					System.out.println("Good Bye~~~");
					break;
				}
				
				// 3. 받기
				msg = dis.readUTF();
				if(msg.equals("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력하세요!!!");
//					break;
					continue;	// 아래 코드
				}
				System.out.println("계산 결과 : " + msg);
			}

		} catch (UnknownHostException e) { // Exception으로 한번에 처리 가능!
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
