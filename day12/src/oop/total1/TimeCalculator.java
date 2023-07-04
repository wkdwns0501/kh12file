package oop.total1;

public class TimeCalculator {
	
	//시간 덧셈 메소드
		public static Time plus(Time a, Time b) {
			long sum = a.getValue() + b.getValue();
			Time result = new Time(sum);
			return result;		
		}
		//시간 뺄셈 메소드
		public static Time minus(Time a, Time b) {
			long diff;
			if(a.getValue() > b.getValue()) {
				diff = a.getValue() - b.getValue();
			}
			else {
				diff = b.getValue() - a.getValue();
			}
			Time result = new Time(diff);
			return result;
		}
}