package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		// 바이트기반
		InputStream is = null; 
		OutputStream os = null;

		try {
			System.out.println("연결 기다림..");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락됨!!");

			// --- 데이터 받기 ---
			// -> 입력 스트림
			byte[] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String msg = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + msg);
			
			//  --- 데이터 보내기 ---
			//  -> 출력 스트림
			os = socket.getOutputStream();
			msg = "Hello Client";
			bytes = msg.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
