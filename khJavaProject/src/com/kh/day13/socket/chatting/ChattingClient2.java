package com.kh.day13.socket.chatting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient2 {

	public static void main(String[] args) {

		Socket socket = null;
		String addr = "127.0.0.1";
		int port = 8502;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("서버에 연결중입니다");
			socket = new Socket(addr, port);
			System.out.println("채팅서버에 접속하였습니다");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			System.out.println("===== 서버와 채팅 시작 =====");
			
			while(true) {
				// 받기
				byte[] buf = new byte[100];
				int readNo = is.read(buf);
				String recvMsg = new String(buf, 0, readNo);
				System.out.println("서버(상대) : " + recvMsg);
				
				// 보내기
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				buf = sendMsg.getBytes();
				os.write(buf);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
