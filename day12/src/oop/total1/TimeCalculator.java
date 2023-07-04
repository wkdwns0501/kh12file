package oop.total1;

import oop.keyword3.Time2;

public class TimeCalculator {
	
	//더하기
	public static Time2 plus(Time2 a, Time2 b) {
		Time result = new Time(a.getValue()+b.getValue())
//		return a + b;
	}
	
	//빼기
	public static int minus(int totalSec1, int totalSec2) {
		if(a.getValue> ) {
			return totalSec1 - totalSec2;
		}
		else if (totalSec1 < totalSec2) {
			return totalSec2 - totalSec1;
		}
		else {
			return 0;
		}
	}
}