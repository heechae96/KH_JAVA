package com.kh.day16.mapCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day16.setCollection.Student;

public class MapRun {

	public void mapExam1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");

		System.out.println("저장된 데이터의 수: " + map.size());
		System.out.println("02를 누르면 서울이 나옵니다: " + map.get("02"));
		System.out.println("031을 누르면 경기도가 나옵니다: " + map.get("031"));

		Scanner sc = new Scanner(System.in);
		System.out.print("지역 번호 입력 >> ");
		String regionCoide = sc.nextLine();

		System.out.println("입력하신 지역번호에 대한 지역은 " + map.get(regionCoide) + "입니다");
	}

	public void mapExam2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "핫팩");
		objMap.put("price", 1500);
		objMap.put("isGood", true);
		System.out.println("상품 이름: " + objMap.get("name"));
		System.out.println("상품 가격: " + objMap.get("price") + "원");
		String result = (boolean) objMap.get("isGood") ? "추천" : "비추천";
		System.out.println("추천 여부: " + result);
	}

	public static void main(String[] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();
		stdMap.put("1", new Student("손예진", 44, 66));
		stdMap.put("2", new Student("현빈", 55, 100));
		
		System.out.println("첫번째 학생 : " + stdMap.get("1"));
		System.out.println("두번째 학생 : " + stdMap.get("2"));
	}

}
