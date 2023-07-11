package api.exception;

import java.time.LocalDate;

public class DateCalculator {
		//연+월을 월로 바꿔주는 메소드
		//연+월+일을 일로 바꿔주는 메소드
		
		//월별 날짜를 반환하는 메소드
		public static int getMonthDay(int year, int month) {
			boolean leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			switch(month) {
			case 2: 
				if(leapYear) return 29;
				else return 28;
			case 4, 6, 9, 11:
				return 30;
			default:
				return 31;
			}
		}
		
		//올해 며칠째인지 계산하는 메소드
		public static int getYearDay(int year, int month, int day) {
			int total = 0;
			for(int i=1; i < month; i++) {
				total += getMonthDay(year, i);
			}
			total += day;
			return total;
		}
		
		//지정한 날짜가 오늘로부터 몇일 전인지 구하는 메소드
		public static int getDayCountBefore(int year, int month, int day) {
			int currentYear = LocalDate.now().getYear();
			int currentMonth = LocalDate.now().getMonthValue();
			int currentDay = LocalDate.now().getDayOfMonth();
			
			int total = 0;
			if(currentYear > year) {
				total += 365 - getYearDay(year, month, day) + 1;
			}
			for(int i=1; i < currentYear - year; i++) {
				total += 365;
			}
			total += getYearDay(currentYear, currentMonth, currentDay);
			
			return total;
		}
}
