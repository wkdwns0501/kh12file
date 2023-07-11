package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		사용자에게 연도와 월을 입력받아서 해당하는 달 달력의 시작날짜를 출력
//		2023년 7월 달력의 시작날짜는 6/25(일) 입니다
		
		//- 달력은 일요일부터 출력한다
		//- 1일이 무슨 요일이냐에 따라서 전달의 출력 일수가 달라진다
		//- 1일이 일요일(week=1)이면 전달 출력 일수는 0일 
		//- 1일이 월요일(week=2)이면 전달 출력 일수는 1일
		//- 1일이 화요일(week=3)이면 전달 출력 일수는 2일
		//- 1일이 수요일(week=4)이면 전달 출력 일수는 3일
		//- 1일이 목요일(week=5)이면 전달 출력 일수는 4일
		//- 1일이 금요일(week=6)이면 전달 출력 일수는 5일
		//- 1일이 토요일(week=7)이면 전달 출력 일수는 6일
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		sc.close();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("week = " + week);
//		System.out.println("달력에는 전달을 " +(week-1)+ "일 출력해야 합니다");
		c.add(Calendar.DATE, -(week-1));
		//출력 - 42번
		int count = 0;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i<42; i++) {
			Date d = c.getTime();
			SimpleDateFormat fmt = new SimpleDateFormat("d");
			System.out.print(fmt.format(d));
			System.out.print("\t");
			c.add(Calendar.DATE, 1);
			count++;
			if(count % 7 == 0) {
				System.out.println();
			}
		}
	}
}
