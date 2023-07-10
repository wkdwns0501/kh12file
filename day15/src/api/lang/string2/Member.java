package api.lang.string2;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel;
	private int memberPoint;
	
	public void setMemberId(String memberId) {
		String regex = "^[A-Za-z0-9]{8,20}$";
		if(memberId.matches(regex)) {
			this.memberId = memberId;
		}
		else System.out.println("8~20자 알파벳+숫자 로 구성");
		
	}
	public void setMemberPw(String memberPw) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
		if(memberPw.matches(regex)) {
			this.memberPw = memberPw;
		}
		else System.out.println("8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성");
	}
	public void setMemberName(String memberName) {
		String regex = "^[가-힣]{2,7}$";
		if(memberName.matches(regex)) {
			this.memberName = memberName;
		}
		else System.out.println("한국인 이름만 가능");
	}
	public void setMemberLevel(String memberLevel) {
		switch(memberLevel) {
		case "관리자":
		case "우수회원":
		case "일반회원":
		}
		this.memberLevel = memberLevel;
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
	public String getFilterPw() {
		String star = "*";
		String filterPw = null;
		for(int i=0; i < memberPw.length(); i++) {
			int count = memberPw.length();
			filterPw = filterPw.replace(memberPw, star.repeat(count));
		}
		return filterPw;
	}
	
	public Member(String memberId, String memberPw, String memberName, String memberLevel, int memberPoint) {
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(memberPoint);
	}
	public Member(String memberId, String memberPw, String memberName) {
		this(memberId,memberPw,memberName,"일반회원",100);
	}
	
	public void show() {
		System.out.println("<회원가입 정보>");
		System.out.println("회원아이디 : " + this.getMemberId());
		System.out.println("회원비밀번호 : " + this.getMemberPw());
		System.out.println("회원이름 : " + this.getMemberName());
		System.out.println("회원 등급 : " + this.getMemberLevel());
		System.out.println("회원 포인트 : " + this.getMemberPoint());
	}
}
