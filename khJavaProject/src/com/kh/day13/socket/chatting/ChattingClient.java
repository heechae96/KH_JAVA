package com.kh.day13.socket.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		// 보조스트림
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			System.out.println("연결 요청");
			socket = new Socket("127.0.0.1", 8502);
			System.out.println("연결 성공!!!");

			// 데이터 보내기
			os = socket.getOutputStream();
			// byte[] bytes = null;
			// bytes = "안녕 서버".getBytes();
			// os.write(bytes);
			dos = new DataOutputStream(os);
			dos.writeUTF("안녕 서버");
			System.out.println("데이터 전송 완료");

			// 데이터 받기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			String msg = dis.readUTF();
			System.out.println("데이터 받기 성공: " + msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
