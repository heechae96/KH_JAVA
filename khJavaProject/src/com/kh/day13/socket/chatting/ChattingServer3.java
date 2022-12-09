package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer3 {

	public static void main(String[] args) {

		ServerSocket ss = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("채팅서버를 구동 중..");
			Thread.sleep(2000); // 2초 지연
			ss = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다!!");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다..");
			Socket socket = ss.accept();
			System.out.println("클라이언트가 접속하였습니다!!");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("===== 클라이언트와 채팅 시작 =====");

			while (true) {
				// 보내기
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
//				byte[] bytes = sendMsg.getBytes();
//				os.write(bytes);

				// 받기
				String recvMsg = dis.readUTF();
//				bytes = new byte[100];
//				int readNo = is.read(bytes);
//				String recvMsg = new String(bytes, 0, readNo);
				System.out.println("클라이언트(상대) : " + recvMsg);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
