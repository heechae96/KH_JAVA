package com.kh.day17.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.practice.member.model.vo.Member;

public class MemberController {

	// 배열을 사용하지 않음
	// 자료구조중 하나인 List인터페이스 사용 할 것
	List<Member> mlist;

	public MemberController() {
		mlist = new ArrayList<Member>();
	}

	// 회원가입
	public void registerMember(Member member) {
		mlist.add(member);
	}

	// 회원정보 전체조회
	public List<Member> printAllMember() {
		return mlist;
	}

	// 회원 아이디로 조회
	public Member findMemberId(String memberId) {
		for (int i = 0; i < mlist.size(); i++) {
			// memberId와 같은 데이터가
			// mList에 있는지 확인
			Member m = mlist.get(i);
			if (memberId.equals(m.getMemberId())) {
				return m;
			}
		}
		return null; // memberId와 같은 데이터가 mList에 없는 경우
	}

	// 회원 이름으로 조회
	public Member findMemberName(String memberName) {
		for (int i = 0; i < mlist.size(); i++) {
			Member m = mlist.get(i);
			if (memberName.equals(m.getMemberName())) {
				return m;
			}
		}
		return null;

	}

	// 회원 탈퇴
	public void deleteMember(Member member) {
		// 아이디를 입력받아서
		// 해당 정보를 삭제
		for (int i = 0; i < mlist.size(); i++) {
			Member m = mlist.get(i);
			if (member.getMemberId().equals(m.getMemberId())) {
				mlist.remove(i);
				break;
			}
		}
	}

	// 회원정보 변경
	public void updateMember(String memberId, Member tmp) {
		// 아이디는 입력받고
		// 해당 아이디의 나머지 정보를 수정
		tmp.setMemberId(memberId);
		for (int i = 0; i < mlist.size(); i++) {
			Member m = mlist.get(i);
			if (memberId.equals(m.getMemberId())) {
				mlist.set(i, tmp);
				break;
			}
		}
	}

}
