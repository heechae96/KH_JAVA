package com.kh.day11.javaApi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {

		String query = "name=heechae&addr=seoul&age=27";
		
		// String[] words = query.split("&");
		
		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(query, "&=");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}

}
