package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜 입력 (yyyy-MM-dd) : ");
		String day = sc.next();
		sc.close();
		System.out.println("기념일 : "+ day);
//		LocalDate a = LocalDate.parse(day);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate a = LocalDate.parse(day, fmt);
		LocalDate after100D = a.plusDays(100L);
		LocalDate after200D = a.plusDays(200L);
		LocalDate after300D = a.plusDays(300L);
		LocalDate after1Y = a.plusYears(1L);
		LocalDate after2Y = a.plusYears(2L);
		LocalDate after3Y = a.plusYears(10L);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일");
		System.out.println("100일 : " + after100D);
		System.out.println("200일 : " + after200D);
		System.out.println("300일 : " + after300D);
		System.out.println("1주년 : " + after1Y);
		System.out.println("2주년 : " + after2Y);
		System.out.println("10주년 : " + after3Y);
	}
}
