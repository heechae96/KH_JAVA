package com.kh.day17.practice.member.model.vo;

public class Member {

	// 아이디, 비밀번호, 이름, 나이, 성별, 이메일
	// 전화번호, 주소, 취미

	// 캡슐화의 원칙에 따라 private로 선언
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private String memberHobby;

	// 생성자
	public Member() {
		super();
	}

	public Member(String memberId, String memberPwd, String memberName, int memberAge, String memberGender,
			String memberEmail, String memberPhone, String memberAddress, String memberHobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
	}
	
	public Member(String memberPwd, String memberName, int memberAge, String memberGender,
			String memberEmail, String memberPhone, String memberAddress, String memberHobby) {
		super();
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
	}

	// Getters and Setters
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberHobby() {
		return memberHobby;
	}

	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}

	// toString()
	@Override
	public String toString() {
		return "[아이디=" + memberId + ", 비밀번호=" + memberPwd + ", 이름=" + memberName
				+ ", 나이=" + memberAge + ", 성별=" + memberGender + ", 이메일=" + memberEmail
				+ ", 번호=" + memberPhone + ", 주소=" + memberAddress + ", 취미=" + memberHobby
				+ "]";
	}

}
