package com.kh.day16.setCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {

	public void setExample1() {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("저장된 데이터의 수 : " + set.size());

		// list와 다르게 get메소드가 없음
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=========================");

		set.add("one"); // 중복된 값이라 저장이 안됨
		System.out.println("저장된 데이터의 수 : " + set.size());

		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=========================");

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(3);
		set2.add(2);
		Iterator<Integer> it2 = set2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

	public static void main(String[] args) {

		// Collection의 List, Set, Map 저장소의 역할을 한다
		// 임시 또는 영구적으로 저장을 함
		// 자료구조의 특성에 따라서 List, Set, Map을 선택하여 쓸 수 있음

		Set<Student> set3 = new HashSet<Student>();
		Student std = new Student("김자바", 10, 30);
		set3.add(std);
		set3.add(new Student("이자바", 50, 70));
		set3.add(new Student("박자바", 30, 90));
		System.out.println("데이터의 크기: "+set3.size());	// 3	// 객체일 경우 반드시 아래와 같은 작업 필요
		set3.add(std);
		System.out.println("데이터의 크기: "+set3.size());	// 4	// hashcode(), equals()를 오버라이딩 하지 않아서
		set3.add(std);
		System.out.println("데이터의 크기: "+set3.size());	// 5	// hashcode(), equals()를 오버라이딩 하지 않아서
		
		System.out.println(std.hashCode());
		System.out.println(std.hashCode());
		System.out.println(std.hashCode());
		
		Iterator<Student> it3 = set3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	}

}
