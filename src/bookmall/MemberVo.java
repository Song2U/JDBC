package bookmall;

public class MemberVo {
	private Long memberNo;			// 회원 번호
	private String memberName;		// 회원명
	private String memberPhone;		// 회원 전화번호
	private String memberEmail;		// 회원 이메일
	private String memberPassword;	// 회원 비밀번호

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Override
	public String toString() {
		return "회원 번호 : " + memberNo + ",\t회원명 : " + memberName + ",\t전화번호 : " + memberPhone
				+ ",\n이메일 주소 : " + memberEmail + ",   비밀번호=" + memberPassword;
	}
}