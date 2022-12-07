package com.kh.day11.javaApi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Gregorian {

	public static void main(String[] args) {

		Calendar cal = new GregorianCalendar();
		System.out.println(cal.getTime());
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String changed = trans2.format(cal.getTime());
		System.out.println("changed : " + changed);
	}

}
