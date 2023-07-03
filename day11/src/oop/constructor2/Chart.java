package oop.constructor2;

public class Chart {
	String title, singer, album;
	long count;
	int heart;
	
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setAlbum(String album) {
		this.album = album;
	}
//	void setCount(long count) {
//		if(count >= 0L) {
//			this.count = count;
//		}
//	}
	void setCount(long count) {
		if(count < 0L) return;
			this.count = count;
	}
	void setHeart(int heart) {
		if(heart >= 0){
			this.heart = heart;
		}
	}
	String getTitle() {
		return this.title;
	}
	String getSinger() {
		if(this.singer == null) {
			return "Various artist";
		}
		else {
			return this.singer;
		}
	}
	String getAlbum() {
		return this.album;
	}
	long getCount() {
		return this.count;
	}
	int getHeart() {
		return this.heart;
	}
	long getRank() {
		return this.count * 2L + this.heart / 2L;
	}
	String getBest() {
		if(this.count > 100000L) {
			return " (베스트)";
		}
		else {
			return "";
		}
	}
	String getHot() {
		if(this.heart > 100000) {
			return " (인기곡)";
		}
		else {
			return "";
		}
	}
	Chart(String title, String singer, String album){
		this(title, singer, album, 0L, 0);
	}
	Chart(String title, String singer, String album, long count, int heart){
		this.setTitle(title);
		this.setSinger(singer);
		this.setAlbum(album);
		this.setCount(count);
		this.setHeart(heart);
	}
	void show() {
		System.out.println("<음원차트>");
		System.out.println("제목 : " + this.getTitle() + this.getBest() + this.getHot());
		System.out.println("가수 : " + this.getSinger());
		System.out.println("앨범 : " + this.getAlbum());
		System.out.println("재생수 : " + this.getCount() + "번");
		System.out.println("좋아요수: " + this.getHeart() + "개");
		System.out.println("랭킹 포인트 : " + getRank() + "점");
	}
}
