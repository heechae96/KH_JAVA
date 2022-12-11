package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {

		ServerSocket ss = null;
		int port = 8589;

		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		int[] numbers = new int[3];

		try {
			System.out.println("서버소켓을 생성했습니다");
			ss = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다립니다");
			Socket socket = ss.accept();
			System.out.println("클라이언트가 접속했습니다");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			Random rand = new Random();

			// ★★★ 로또 프로그램에서 사용했던 방법 ★★★
			// 번호 3개를 뽑은 후에 게임 준비해야함
			for (int i = 0; i < numbers.length; i++) {
				// 1부터 9사이의 랜덤한 숫자
				numbers[i] = rand.nextInt(9) + 1;
				// 중복제거
				for (int e = 0; e < i; e++) {
					if (numbers[e] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.println("서버 숫자 -> " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("===== 서버 준비 완료 =====");

			// 값 받기
			String readNum = dis.readUTF();
			System.out.println("받은값: " + readNum);

			// 넘어온값은 String. 비교하려면 문자열 배열이 편리
			// 비교하려는 대상을 일치시켜줘야 한다(String -> int)
			String[] readUpdateNum = readNum.split(" ");
			int[] readUpdateIntNum = new int[3];
			for (int i = 0; i < readUpdateNum.length; i++) {
				readUpdateIntNum[i] = Integer.parseInt(readUpdateNum[i]);
			}

			/*
			 * 받은 값이 numbers의 값과 비교했을 때 숫자가 맞고 위치도 맞는지 숫자는 맞는데 위치는 틀린지 아무것도 맞지 않았는지를 스트라이크,
			 * 볼로 출력해준다
			 */

			// 인덱스랑 값 둘 다 비교해야함..
			// 중첩 for문 필요
			int strike = 0;
			int ball = 0;
			int cnt = 0; // 인덱스랑 값이 3개 모두 같으면 4볼로 진루 시키기 위한 변수
			int check = 0; // 값이 일치하는게 없는 경우 스트라이크를 올려주기 위한 변수

			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < readUpdateIntNum.length; j++) {
					if (numbers[i] == readUpdateIntNum[j]) {
						ball++; // 값은 일치
						if (i == j) {
							cnt++; // 값이 같은게 있는 경우 + 인덱스까지 일치하는 경우
						}
					} else {
						check++;
						if (check == 3) {
							strike++;
						}
					}
				}
				check = 0;
			}

			if (cnt == 3) { // 포볼로 진루
				ball++;
			}

			// 클라이언트로 결과값 보내주기!
			System.out.println(strike + "스트라이크 " + ball + "볼");
			if (ball == 4) {
				System.out.println("포볼로 1루로 진루");
			}
			if (strike == 3) {
				System.out.println("스트라이크 아웃!!!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}