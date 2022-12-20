package com.kh.day19.practice.music.run;

import java.util.List;

import com.kh.day19.practice.music.controller.MusicController;
import com.kh.day19.practice.music.model.vo.Music;
import com.kh.day19.practice.music.view.MusicView;

public class Run {

	public static void main(String[] args) {

		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		int select = 0;
		Music music = null;
		String title = "";
		int index = 0;

		do {
			select = view.musicMenu();

			switch (select) {
			case 1:
				music = view.inputMusicInfo("마지막");
				mCon.addAtLast(music);
				view.displaySuccess("추가 성공!!");
				break;
			case 2:
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				view.displaySuccess("추가 성공!!");
				break;
			case 3:
				List<Music> allList = mCon.printMusicList();
				view.showAllMusicList(allList);
				view.displaySuccess("출력 성공!!");
				break;
			case 4:
				title = view.inputMusicName("검색할");
				List<Music> findList = mCon.searchMusicsBynName(title);
				view.showAllMusicList(findList);
				view.displaySuccess("조회 성공!!");
//				index = mCon.searchOneByName(title);
//				music = mCon.selectOneByIndex(index);
//				view.showOneMusic(music);
				break;
			case 5:
				title = view.inputMusicName("삭제할");
				index = mCon.searchOneByName(title);
				mCon.removeMusic(index);
				view.displaySuccess("삭제 성공!!");
				break;
			case 6:
				title = view.inputMusicName("수정");
				index = mCon.searchOneByName(title);
				if (index == -1) {
					view.displayError("조회 실패..");
					break;
				}
				music = view.modifyMusicInfo(music);
				mCon.updateMusic(index, music);
				view.displaySuccess("수정 성공!!");
				break;
			case 7:
				view.printMessage("===== 곡명 오름차순 정렬 =====");
				mCon.sortByTitleAsc();
				view.printMessage("오름차순 정렬 성공!! 3번을 눌러확인하세요");
				break;
			case 8:
				view.printMessage("===== 곡명 내림차순 정렬 =====");
				mCon.sortByTitleDesc();
				view.printMessage("내림차순 정렬 성공!! 3번을 눌러확인하세요");
				break;
			case 9:
				view.printMessage("===== 가수명 오름차순 정렬 =====");
				mCon.sortBySingerAsc();
				view.printMessage("오름차순 정렬 성공!! 3번을 눌러확인하세요");
				break;
			case 10:
				view.printMessage("===== 가수명 내림차순 정렬 =====");
				mCon.sortBySingerDesc();
				view.printMessage("내림차순 정렬 성공!! 3번을 눌러확인하세요");
				break;
			}
		} while (select != 0);
	}

}
