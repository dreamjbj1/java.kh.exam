package com.kh.practice.list.music_run;

import com.kh.practice.list.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		int result = a.compareTo(b);  // a를 기준으로 b와 비교함 
		System.out.println(result);
		new MusicView().mainMenu();
	}
}
