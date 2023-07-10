package api.lang.string2;

public class Member {
	//필드 - 데이터(5개)
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel; //입력이 아닌 기본값 (일반회원)
	private int memberPoint; //입력이 아닌 기본값 (100점)
	
	public void setMemberId(String memberId) {
		if(memberId.matches("^[A-Za-z0-9]{8,20}$")) {
			this.memberId = memberId;
		}
	}
	public void setMemberPw(String memberPw) {
		if(memberPw.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$")) {
			this.memberPw = memberPw;
		}
	}
	public void setMemberName(String memberName) {
		if(memberName.matches("^[가-힣]{1,2}[가-힣]{1,5}$")) {
			this.memberName = memberName;
		}
	}
	public void setMemberLevel(String memberLevel) {
//		switch(memberLevel) {
//		case "관리자": case "우수회원": case "일반회원":
//			this.memberLevel = memberLevel;
//		}
		if(memberLevel.matches("^(관리자|우수회원|일반회원)$") ){
			this.memberLevel = memberLevel;
		}
	}
	public void setMemberPoint(int memberPoint) {
		if(memberPoint < 0) return;
		this.memberPoint = memberPoint;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public String getMaskPw() {
		return this.memberPw.substring(0,2) + "*".repeat(memberPw.length()-2);
	}
	
	public Member(String memberId, String memberPw, String memberName) {
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel("일반회원");
		this.setMemberPoint(100);
	}
	
	public void show() {
		System.out.println("<회원정보>");
		System.out.println("아이디 : "+ this.memberId);
		System.out.println("비밀번호 : "+ this.getMaskPw());
		System.out.println("이름 : "+ this.memberName);
		System.out.println("등급 : "+ this.memberLevel);
		System.out.println("포인트 : "+ this.memberPoint);
	}
}
