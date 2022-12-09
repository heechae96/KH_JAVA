package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		InputStream is = null;
		OutputStream os = null;
		// 보조스트림
		DataInputStream dis = null;	
		DataOutputStream dos = null;
		
		try {
			ss = new ServerSocket(8502);
			System.out.println("연결을 기다림");
			Socket socket = ss.accept();
			System.out.println("연결 수락됨~~~");
			
			// 데이터 받기
			is = socket.getInputStream();
//			byte[] bytes = new byte[100];
//			int readByteNo = is.read(bytes);
//			String msg = new String(bytes, 0, readByteNo);
			dis = new DataInputStream(is);
			String msg = dis.readUTF();
			System.out.println("데이터 받기 성공: " + msg);
			
			// 데이터 보내기
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF("안녕 클라이언트");
			System.out.println("전송 완료!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
