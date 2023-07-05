package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		Mp4 a = new Mp4();
		a.setFileName("상속.mp4");
		a.setFileSize(100000L);
		a.setSpeed(1.2f);
		a.execute();
		a.forward();
		a.rewind();
		
		Mp3 b = new Mp3();
		b.setFileName("자바의 정석.mp3");
		b.setFileSize(100000L);
		b.setDuration(180);
		b.execute();
		b.forward();
		b.rewind();
		
		Hwp c = new Hwp();
		c.setFileName("시험필기.hwp");
		c.setFileSize(999L);
		c.setPagesize(0);
		c.execute();
		c.preview();
		
		Ppt d = new Ppt();
		d.setFileName("자바 소개.ppt");
		d.setFileSize(98227L);
		d.setPagesize(150);
		d.execute();
		d.slideShow();
	}
}