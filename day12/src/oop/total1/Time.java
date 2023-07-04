package oop.total1;

public class Time {
	private int hour;
	private int min;
	private int sec;
	
	public void setHour(int hour) {
		this.hour  = hour;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getHour() {
		return hour;
	}
	public int getMin() {
		return min;
	}
	public int getSec() {
		return sec;
	}
	public int getTotalSec() {
		return this.hour * 3600 + this.min * 60 + this.sec;
	}
	public int getResultHour() {
		return this.getTotalSec() / 3600;
	}
	public int getResultMin() {
		return (this.getTotalSec() % 3600) / 60;
	}
	public int getResultSec() {
		return (this.getTotalSec() % 3600) % 60;
	}
	public Time(int sec) {
		this(0, 0, sec);
	}
	public Time(int min, int sec) {
		this(0, min, sec);
	}
	public Time(int hour, int min, int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}
	public void show() {
		System.out.println("<원래 시간>");
		System.out.println(this.getHour() +"시간 "+ this.getMin() +"분 "+ this.getSec()+ "초 ");
		System.out.println("<환산 시간>");
		System.out.println(this.getResultHour() + "시간 " + this.getResultMin() + "분 " + this.getResultSec() + "초 ");
	}
}
