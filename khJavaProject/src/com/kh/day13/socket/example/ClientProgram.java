package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) {

		Socket socket = null;
		// 바이트기반
		OutputStream os = null;	
		InputStream is = null; 

		
		try {
			System.out.println("연결 요청");
			//					localhost, ServerSocketNum
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결 성공!!");
			
			// --- 데이터 보내기 ---
			// -> 출력스트림
			byte[] buf = null;
			String msg = "";
			os = socket.getOutputStream();
			msg = "Hello Server";
			buf = msg.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			
			// --- 데이터 받기 ---
			// -> 입력 스트림
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			msg = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + msg);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
