package com.kh.day08.student;

public class StudentRun {

	public static void main(String[] args) {

		StudentFunction sFunc = new StudentFunction();
		
		Outer:
		while(true) {
			int choice = sFunc.printMenu();
			
			switch(choice) {
				case 1:
					sFunc.inputScore();
					break;
				case 2:
					sFunc.printScore();
					break;
				case 3:	// 재평가 여부
					sFunc.checkPass();
					break;
				case 4:
					sFunc.printGoodBye();
					break Outer;
				default:
					sFunc.printException();
					break;
			}
		}
	
	}

}
