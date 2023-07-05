package oop.inherit3;

//상위 클래스
public class Browser {
	//필드
	private String url;
	//setter/getter 메소드
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	//공통 메소드
	public void refresh() {
		System.out.println("새로고침 기능 실행");
	}
	public void move() {
		System.out.println("페이지 이동 기능 실행");
	}
}
