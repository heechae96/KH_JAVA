package com.kh.day17.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day17.practice.member.model.vo.Member;

public class MemberView {

	public int mainMenu() {
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 변경");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택 >> ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		return num;
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String memberId = sc.next();
		System.out.print("비밀번호: ");
		String memberPwd = sc.next();
		System.out.print("이름: ");
		String memberName = sc.next();
		System.out.print("나이: ");
		int memberAge = sc.nextInt();
		System.out.print("성별: ");
		String memberGender = sc.next();
		System.out.print("이메일: ");
		String memberEmail = sc.next();
		System.out.print("전화번호: ");
		String memberPhone = sc.next();
		System.out.print("주소: ");
		sc.nextLine(); // nextLine()전 기존 버퍼 비워줘야함
		String memberAddress = sc.nextLine();
		System.out.print("취미: ");
		String memberHobby = sc.next();

		return new Member(memberId, memberPwd, memberName, memberAge, memberGender, memberEmail, memberPhone,
				memberAddress, memberHobby);

	}

	public void showAllMember(List<Member> mList) {
		System.out.println("====== 회원정보 전체조회 ======");
		for (Member m : mList) {
			System.out.println(m);
		}
	}

	public String inputMemberId(String msg) { // 메서드 새로 만들기 싫은 경우 매개 변수값을 입력 받아서 사용!
		Scanner sc = new Scanner(System.in);
		System.out.print(msg + " 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}

	public void printOneById(Member m) {
		System.out.println(m);
	}

	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 입력 : ");
		String memberName = sc.next();
		return memberName;
	}

	public void printOneByName(Member m) {
		System.out.println(m);
	}

	public Member updateMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 비밀번호: ");
		String memberPwd = sc.next();
		System.out.print("변경할 이름: ");
		String memberName = sc.next();
		System.out.print("변경할 나이: ");
		int memberAge = sc.nextInt();
		System.out.print("변경할 성별: ");
		String memberGender = sc.next();
		System.out.print("변경할 이메일: ");
		String memberEmail = sc.next();
		System.out.print("변경할 전화번호: ");
		String memberPhone = sc.next();
		System.out.print("변경할 주소: ");
		sc.nextLine(); // nextLine()전 기존 버퍼 비워줘야함
		String memberAddress = sc.nextLine();
		System.out.print("변경할 취미: ");
		String memberHobby = sc.next();

		return new Member(memberPwd, memberName, memberAge, memberGender, memberEmail, memberPhone, memberAddress,
				memberHobby);

	}

	// 성공 메세지
	public void displaySuccess(String msg) {
		System.out.println("처리 결과 : " + msg);
	}

	// 실패 메세지
	public void displayError(String msg) {
		System.out.println("처리 결과 : " + msg);
	}

}
