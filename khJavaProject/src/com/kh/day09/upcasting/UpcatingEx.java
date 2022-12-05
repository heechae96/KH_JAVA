package com.kh.day09.upcasting;

public class UpcatingEx {

	public static void main(String[] args) {

		Person p;
		Student s = new Student("일용자");
//		p = new Person("");
		p = s;	// 업캐스팅, 자동형변환
		
		System.out.println(p.name);
		// 업캐스팅으로 인하여 서브 클래스 멤버에 접근 불가
		// grade cannot be resolved or is not a field
//		System.out.println(p.grade);
		// department cannot be resolved or is not a field
//		System.out.println(p.department);
		
		// 다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
	}

}
