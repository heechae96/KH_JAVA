package com.kh.day11.javaApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_Date {

	public static void main(String[] args) {

		// Calendar와 다르게 객체 생성
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println(transDate1);
		System.out.println(transDate2);

	}

}
