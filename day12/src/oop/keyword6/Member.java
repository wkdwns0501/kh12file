package oop.keyword6;

public class Member {
	private final String id;
	private String passWord;
	private String nickName;
	
	public String getId() {
		return id;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassWord() {
		return passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public Member(String id, String passWord, String nickName) {
		this.id = id;
		this.passWord = passWord;
		this.nickName = nickName;
	}
	
	public String getPwM() {
		return "" + this.passWord.charAt(0) + this.passWord.charAt(1) + "**********";
	}

	public void show() {
		System.out.println("<회원 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("비밀번호 : " + this.getPwM());
		System.out.println("닉네임 : " + this.getNickName());
	}
}
