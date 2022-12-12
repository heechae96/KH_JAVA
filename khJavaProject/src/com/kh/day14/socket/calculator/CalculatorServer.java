package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {

		ServerSocket ss = null;
		int port = 8989;

		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			System.out.println("서버 구동중입니다");
			Thread.sleep(2000);
			ss = new ServerSocket(port);
			System.out.println("클라이언트의 응답을 기다리고 있습니다..");
			Socket socket = ss.accept();
			System.out.println("클라이언트와 연결되었습니다!");

			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			while (true) {
				// 받은 메시지 : 12 + 1
				String msg = dis.readUTF();
				if (msg.equalsIgnoreCase("bye")) { // 대소문자 구별 없이
					System.out.println("See you~~~");
					break;
				}
				System.out.println("받은값: " + msg);
				String[] msgArr = msg.split(" ");
				if (msgArr.length != 3) {
					msg = "end";
					dos.writeUTF(msg);
//					break;
					continue;
				}
				int n1 = Integer.parseInt(msgArr[0]);
				String op = msgArr[1];
				int n2 = Integer.parseInt(msgArr[2]);
				String result = "";

				// int -> String
				switch (op) { // 보내기
				case "+":
					result = n1 + n2 + "";
					dos.writeUTF(result);
					break;
				case "-":
					result = String.valueOf(n1 - n2);
					dos.writeUTF(result);
					break;
				case "*":
					result = Integer.toString(n1 * n2);
					dos.writeUTF(result);
					break;
				case "/":
					result = Double.toString((double) n1 / n2);
					dos.writeUTF(result);
					break;
				case "%":
					result = Integer.toString(n1 % n2);
					dos.writeUTF(result);
					break;
				default:
					result = "연산자를 다시 확인해주세요!!!";
					dos.writeUTF(result);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
