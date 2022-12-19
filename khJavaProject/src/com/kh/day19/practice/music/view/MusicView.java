package com.kh.day19.practice.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day19.practice.music.model.vo.Music;

public class MusicView {

	public int musicMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public Music inputMusicInfo(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + " 위치에 곡 추가");
		System.out.print("곡명: ");
		String title = sc.nextLine();
		System.out.print("가수명: ");
		String singer = sc.nextLine();

		// 두 개의 정보를 하나의 변수로 다루기 위해
		// 객체가 필요함!
		Music music = new Music(title, singer);
		return music;
	}

	public String inputMusicName(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg + " 곡 입력: ");
		String title = sc.nextLine();
		return title;
	}

	public void showAllMusicList(List<Music> mList) {
		System.out.println("===== 전체 곡 목록 출력 =====");
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.println((i + 1) + "번째 노래 -> " + "곡명 " + music.getTitle() + ", 가수명 : " + music.getSinger());
		}
	}

	public void showOneMusic(Music music) {
		System.out.println("검색한 곡의 곡명은: " + music.getTitle() + ", 가수명 : " + music.getSinger());
	}
	
	public Music modifyMusicInfo(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 가수명 입력: ");
		String singer = sc.nextLine();
		music.setSinger(singer);
		return music;
	}
	
	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 곡명 입력: ");
		String title = sc.nextLine();
		System.out.println("수정할 가수명 입력: ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

}
