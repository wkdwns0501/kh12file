package api.lang.string2;

public class Member {
	//필드 - 데이터(5개)
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevel; //입력이 아닌 기본값 (일반회원)
	private int memberPoint; //입력이 아닌 기본값 (100점)
	
	public void setMemberId(String memberId) {
<<<<<<< HEAD
		String regex = "^[A-Za-z0-9]{8,20}$";
		if(memberId.matches(regex)) {
=======
		if(memberId.matches("^[A-Za-z0-9]{8,20}$")) {
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
			this.memberId = memberId;
		}
<<<<<<< HEAD
		else System.out.println("8~20자 알파벳+숫자 로 구성");
		
=======
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
	public void setMemberPw(String memberPw) {
		if(memberPw.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$")) {
			this.memberPw = memberPw;
		}
<<<<<<< HEAD
		else System.out.println("8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성");
=======
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
	public void setMemberName(String memberName) {
<<<<<<< HEAD
		String regex = "^[가-힣]{2,7}$";
		if(memberName.matches(regex)) {
=======
		if(memberName.matches("^[가-힣]{1,2}[가-힣]{1,5}$")) {
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
			this.memberName = memberName;
		}
<<<<<<< HEAD
		else System.out.println("한국인 이름만 가능");
=======
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
	public void setMemberLevel(String memberLevel) {
<<<<<<< HEAD
		switch(memberLevel) {
		case "관리자":
		case "우수회원":
		case "일반회원":
		}
		this.memberLevel = memberLevel;
=======
//		switch(memberLevel) {
//		case "관리자": case "우수회원": case "일반회원":
//			this.memberLevel = memberLevel;
//		}
		if(memberLevel.matches("^(관리자|우수회원|일반회원)$") ){
			this.memberLevel = memberLevel;
		}
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
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
<<<<<<< HEAD
	public String getFilterPw() {
		String star = "*";
		String filterPw = null;
		for(int i=0; i < memberPw.length(); i++) {
			int count = memberPw.length();
			filterPw = filterPw.replace(memberPw, star.repeat(count));
		}
		return filterPw;
=======
	public String getMaskPw() {
		if(this.memberPw == null) return null;
		return this.memberPw.substring(0,2) + "*".repeat(memberPw.length()-2);
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
	
	public Member(String memberId, String memberPw, String memberName) {
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
<<<<<<< HEAD
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(memberPoint);
	}
	public Member(String memberId, String memberPw, String memberName) {
		this(memberId,memberPw,memberName,"일반회원",100);
=======
		this.setMemberLevel("일반회원");
		this.setMemberPoint(100);
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
	
	public void show() {
<<<<<<< HEAD
		System.out.println("<회원가입 정보>");
		System.out.println("회원아이디 : " + this.getMemberId());
		System.out.println("회원비밀번호 : " + this.getMemberPw());
		System.out.println("회원이름 : " + this.getMemberName());
		System.out.println("회원 등급 : " + this.getMemberLevel());
		System.out.println("회원 포인트 : " + this.getMemberPoint());
=======
		System.out.println("<회원정보>");
		System.out.println("아이디 : "+ this.memberId);
		System.out.println("비밀번호 : "+ this.getMaskPw());
		System.out.println("이름 : "+ this.memberName);
		System.out.println("등급 : "+ this.memberLevel);
		System.out.println("포인트 : "+ this.memberPoint);
>>>>>>> branch 'main' of https://github.com/wkdwns0501/kh12file.git
	}
}
