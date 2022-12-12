package com.kh.day14.exercise;

public class Run {

	public static void main(String[] args) {
		
		Exercise_IOStream ex = new Exercise_IOStream();
		
		int num = ex.printMenu();

		EXIT: while (true) {
			switch (num) {
			case 1:
				ex.insertInfo();
				break;
			case 2:
				ex.printInfo();
				break;
			case 3:
				ex.save();
				break;
			case 4:
				ex.load();
				break;
			case 0:
				break EXIT;
			default:
				System.out.println("올바른 번호를 입력하세요");
				break;
			}
		}
	}

}
