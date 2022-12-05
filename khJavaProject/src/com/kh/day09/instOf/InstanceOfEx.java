package com.kh.day09.instOf;

public class InstanceOfEx {

	static void print(Person p) {
//		Person p = new Student();
//		if(p instanceof Person)
//			System.out.println("Person입니다!!");
		if(p instanceof Student)
			System.out.println("Student입니다!!");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다!!");
		if(p instanceof Professor)
			System.out.println("Professor입니다!!");
			
	}
	
	public static void main(String[] args) {

//		print(new Person());	// 아래 문장들은 업캐스팅이 동작되어서 오류없이 실행 가능
		print(new Student());	// Person p = new Student();
		print(new Researcher());// Person p = new Researcher();
		print(new Professor());	// Person p = new Professor();
		
	}

}
