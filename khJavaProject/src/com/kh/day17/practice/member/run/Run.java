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
			case 1: // 회원정보 전체 조회
				List<Member> mlist = controller.printAllMember();
				if(mlist.size()==0) {
					view.displayError("회원가입한 사용자가 없습니다..");
				}else {
					view.showAllMember(mlist);
					view.displaySuccess("조회 성공!");
				}
				break;
			case 2: // 회원 아이디로 조회
				String memberId = view.inputMemberId("검색할");
				Member mOneById = controller.findMemberId(memberId);
				if (mOneById == null) {
					view.displayError("해당 아이디가 존재하지 않습니다");
				} else {
					view.printOneById(mOneById);
					view.displaySuccess("조회 성공!");
				}
				break;
			case 3: // 회원 이름으로 조회
				String memberName = view.inputMemberName();
				Member mOneByName = controller.findMemberName(memberName);
				if (mOneByName == null) {
					view.displayError("해당 이름이 존재하지 않습니다");
				} else {
					view.printOneByName(mOneByName);
					view.displaySuccess("조회 성공!");
				}
				break;
			case 4: // 회원가입
				Member m = view.inputMember();
				controller.registerMember(m);
				view.displaySuccess("가입 성공!");
				break;
			case 5: // 회원정보 변경
				String id = view.inputMemberId("변경할");
				Member mOneById3 = controller.findMemberId(id);
				if (mOneById3 == null) {
					view.displayError("해당 아이디가 존재하지 않습니다");
				} else {
					mOneById3 = view.updateMember();
					controller.updateMember(id, mOneById3);
					view.displaySuccess("변경 성공!");
				}
				break;
			case 6: // 회원탈퇴
				String memberId2 = view.inputMemberId("탈퇴할");
				Member mOneById2 = controller.findMemberId(memberId2);
				if (mOneById2 == null) {
					view.displayError("해당 아이디가 존재하지 않습니다");
				} else {
					controller.deleteMember(mOneById2);
					view.displaySuccess("탈퇴 성공!");
				}
				break;
			case 0: // 프로그램 종료
				break Exit;
			}
		}
	}

}
