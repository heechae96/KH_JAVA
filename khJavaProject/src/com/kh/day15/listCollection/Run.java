package com.kh.day15.listCollection;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
//		Run run = new Run();
//		run.intExample();
//		run.objectExample();
//		run.genericExample();
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		
		for(Student std : studentList) {
			System.out.println(std.toString());
		}
		
		System.out.println("==========================");

		List<Integer> list = null;

		list = new ArrayList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);

		int size = list.size();
		System.out.println("size: " + size);
		System.out.println("첫번째 값: " + list.get(0));

		list.add(2023);
		size = list.size();
		System.out.println("size: " + size);

//		list.clear();
//		size = list.size();
//		System.out.println("size: " + size);
		
		System.out.println("==========================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println((i+1)+"번째 값: " + list.get(i));
		}
		
		list.add(2, 2022);	// 인덱스 2번에 2022 추가
		
		System.out.println("==========================");
		
		for(Integer iOne : list) {
			System.out.println("출력: " + iOne);
		}
		
		list.set(4, 12345);	// 인덱스 4번을 12345로 수정
		
		System.out.println("==========================");
		
		for(Integer iOne : list) {
			System.out.println("출력: " + iOne);
		}
	}

	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);

		int num = list.get(0);
		num = list.get(1);
		System.out.println("num: " + num);
	}

	public void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student());

		int num = (int) list.get(0);
		String word = (String) list.get(1);
		Student sOne = (Student) list.get(2);

		System.out.println("첫번째: " + list.get(0));
		System.out.println("두번째: " + list.get(1));
		System.out.println("세번째: " + list.get(2));
		System.out.println("크기: " + list.size());

		list.clear();// 삭제
		System.out.println("크기: " + list.size());
	}

	public void intExample() {
		IntList list = new IntList();

		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println("첫번째: " + list.get(0));
		System.out.println("두번째: " + list.get(1));
		System.out.println("세번째: " + list.get(2));
		System.out.println("크기: " + list.size());

		list.clear();// 삭제
		System.out.println("크기: " + list.size());
	}

}
