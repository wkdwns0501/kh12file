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
			System.out.println("멋진 아이디네요!");
			this.memberId = memberId;
		}
		else {
			System.out.println("8~20자의 알파벳+숫자만 사용 가능합니다.");
		}
	}
	public void setMemberPw(String memberPw) {
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
		if(memberPw.matches(regex)) {
			this.memberPw = memberPw;
		}
		else {
			System.out.println("8~15자의 알파벳+숫자+특수문자를 반드시 포함하여야 합니다.");
		}
	}
	public void setMemberName(String memberName) {
		String regex = "^[가-힣][가-힣]{1,2}$";
		if(memberName.matches(regex)) {
			this.memberName = memberName;
		}
		else {
			System.out.println("한국인 이름이 아닙니다.");
		}
	}
	public void setMemberLevel(String memberLevel) {
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
	
	public Member(String memberId, String memberPw, String memberName, String memberLevel, int memberPoint) {
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(memberPoint);
	}
	public Member(String memberId, String memberPw, String memberName, String memberLevel) {
		this(memberId,memberPw,memberName,memberLevel,100);
	}
	
	public void show() {
		
	}
}
