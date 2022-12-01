package com.kh.day07.run;

import com.kh.day07.student.StudentFunction;

public class StudentRun {

	public static void main(String[] args) {

		StudentFunction stuFunc = new StudentFunction();
		
		Outer: 
		while (true) {
			int input = stuFunc.printMenu();

			switch (input) {
				case 1:
					stuFunc.inputScore();
					break;
				case 2:
					stuFunc.printScore();
					break;
				case 3:
					stuFunc.goodByeMsg();
					break Outer;
				default:
					stuFunc.exception();
					break;
			}
		}
	}

}
