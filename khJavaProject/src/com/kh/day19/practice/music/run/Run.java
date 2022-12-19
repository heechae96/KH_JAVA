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
				break;
			case 2:
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				break;
			case 3:
				List<Music> allList = mCon.printMusicList();
				view.showAllMusicList(allList);
				break;
			case 4:
				title = view.inputMusicName("검색할");
				index = mCon.searchOneByName(title);
				music = mCon.selectOneByIndex(index);
				view.showOneMusic(music);
				break;
			case 5:
				title = view.inputMusicName("삭제할");
				index = mCon.searchOneByName(title);
				mCon.removeMusic(index);
				break;
			case 6:
				title = view.inputMusicName("수정");
				index = mCon.searchOneByName(title);
				music = view.modifyMusicInfo(music);
				mCon.updateMusic(index, music);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			}
		} while (select != 0);
	}

}
