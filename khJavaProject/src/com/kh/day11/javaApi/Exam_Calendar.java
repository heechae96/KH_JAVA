package com.kh.day11.javaApi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void printCalendar(String msg, Calendar cal) {
//		Calendar today = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0: 1월, 1: 2월, ...
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);	// 0: 일요일,  1: 월요일, ...
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);	// 24시간
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
		System.out.print(msg + " " + year + "/" + month + "/" + day + "/");
		switch (dayOfWeek) {
			case Calendar.SUNDAY:
				System.out.print("일요일");
				break;
			case Calendar.MONDAY:
				System.out.print("월요일");
				break;
			case Calendar.TUESDAY:
				System.out.print("화요일");
				break;
			case Calendar.WEDNESDAY:
				System.out.print("수요일");
				break;
			case Calendar.THURSDAY:
				System.out.print("목요일");
				break;
			case Calendar.FRIDAY:
				System.out.print("금요일");
				break;
			case Calendar.SATURDAY:
				System.out.println("토요일");
				break;
		}
		System.out.print("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM)
			System.out.print(" 오전 ");
		else
			System.out.print(" 오후 ");
		System.out.print(hour + "시" + minute + "분" + second + "초 " + millisecond + "밀리초");
	}

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		printCalendar("현재", today);
		// 현재 2022/11/7/월요일(12시) 오후 0시17분53초 871밀리초
		
		System.out.println("\n------------------------------------------------------");
		
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		printCalendar("개강일", someDate);
		// 개강일 2022/11/23/월요일(9시) 오전 9시0분0초 0밀리초
		
		System.out.println("\n------------------------------------------------------");
		
		Calendar someDate2 = Calendar.getInstance();
		someDate2.clear();
		someDate2.set(2023, 4, 2);
		someDate2.set(Calendar.HOUR_OF_DAY, 17);
		someDate2.set(Calendar.MINUTE, 50);
		printCalendar("종강일", someDate2);
		// 종강일 2023/5/2/화요일(17시) 오후 5시50분0초 0밀리초
	
	}

}
