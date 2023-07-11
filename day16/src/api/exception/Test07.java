package api.exception;

public class Test07 {
	public static void main(String[] args) {
		System.out.println(DateCalculator.getMonthDay(2023, 7));
		System.out.println(DateCalculator.getYearDay(2023, 7, 11));
		
		//만약에 2021-03-15일생이면
		int total = 0;
		total += 365 - DateCalculator.getYearDay(2021, 3, 15) + 1;
		total += 365;
		total += DateCalculator.getYearDay(2023, 7, 11);
		System.out.println("total = " + total);
		
		int year = 2021;
		int month = 3;
		int day = 15;
		
		int days = DateCalculator.getDayCountBefore(year, month, day);
		System.out.println("days = " + days);
		
		int globalAge = days / 365;
		System.out.println("만나이 = " + globalAge);
	}
}
