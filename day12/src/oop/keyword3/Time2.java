package oop.keyword3;

public class Time2 {
	//필드 - 초
	private long value;
	
	//필드에 대한 setter/getter
	public long getValue() {
		return value;
	}
	public void setValue(long value) {
		if(value < 0L) return;
		this.value = value;
	}
	
	//생성자
	public Time2(long hour, long min, long sec) {
		long total = hour * 60 * 60 + min *60 + sec;
		this.setValue(total);
	}
	public Time2( long min, long sec) {
		long total = min * 60 + sec;
		this.setValue(total);
	}
	public Time2(long sec) {
		this.setValue(sec);
	}
	
	//가상의 getter 메소드
	public long getHour() {
		return this.value / 60 / 60;
	}
	public long getMin() {
		return this.value / 60 % 60;
	}
	public long getSec() {
		return this.value % 60;
	}
	
	public void show() {
		System.out.print(this.getHour());
		System.out.print("시간 ");
		System.out.print(this.getMin());
		System.out.print("분 ");
		System.out.print(this.getSec());
		System.out.print("초 ");
	}
}
