package com.kh.day17.practice.member.run;

import java.util.List;

import com.kh.day17.practice.member.controller.MemberController;
import com.kh.day17.practice.member.model.vo.Member;
import com.kh.day17.practice.member.view.MemberView;

public class Run {

	public static void main(String[] args) {

		MemberView view = new MemberView();
		MemberController controller = new MemberController();

		Exit: while (true) {
			int num = view.mainMenu();
			
			switch (num) {
			case 1:	// 회원정보 전체 조회
				List<Member> mlist = controller.printAllMember();
				view.showAllMember(mlist);
				break;
			case 2: // 회원 아이디로 조회
				String memberId = view.inputMemberId("검색할");
				Member mOneById = controller.findMemberId(memberId);
				if (mOneById == null) {
//					System.out.println("해당 아이디가 존재하지 않습니다");
				}
				view.printOneById(mOneById);
				break;
			case 3: // 회원 이름으로 조회
				String memberName = view.inputMemberName();
				Member mOneByName = controller.findMemberName(memberName);
				if(mOneByName == null) {
//					System.out.println("해당 이름이 존재하지 않습니다");
				}
				view.printOneByName(mOneByName);
				break;
			case 4: // 회원가입
				Member m = view.inputMember();
				controller.registerMember(m);
				break;
			case 5: // 회원정보 변경
				break;
			case 6: // 회원탈퇴
				String memberId2 = view.inputMemberId("탈퇴할");
				Member mOneById2 = controller.deleteMember(memberId2);
				if(mOneById2 == null) {
//					System.out.println("해당 아이디가 존재하지 않습니다");
				}
				view.deleteMemberById(mOneById2);
				break;
			case 0:	// 프로그램 종료
				break Exit;
			}
		}
	}

}
