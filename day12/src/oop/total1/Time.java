package oop.total1;

public class Time {
	//필드 - 시간을 초로 저장할 수 있는 필드 1개만 구현
		private long value;
		
		//필드에 대한 Setter/Getter
		public void setValue(long value) {
			if(value < 0L) return;
			this.value = value;
		}
		public long getValue() {
			return value;
		}
		
		//생성자
		//[1] 시간/분/초를 설정할 수 있는 생성자
		public Time(long hour, long minute, long second) {
			long total = hour * 60 * 60 + minute * 60 + second;
			this.setValue(total);
		}
		//[2] 분/초를 설정할 수 있는 생성자
		public Time(long minute, long second) {
			long total = minute * 60 + second;
			this.setValue(total);
		}
		//[3] 초를 설정할 수 있는 생성자
		public Time(long second) {
			this.setValue(second);
		}
		
		//가상의 Getter 메소드
		public long getHour() {
			return this.value / 60 / 60;
		}
		public long getMinute() {
			return this.value / 60 % 60;
		}
		public long getSecond() {
			return this.value % 60;
		}
	public void show() {
		System.out.println("<환산 시간>");
		System.out.println(this.getHour() + "시간 " + this.getMinute() + "분 " + this.getSecond() + "초 ");
	}
}
