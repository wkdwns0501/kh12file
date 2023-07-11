package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		//오늘부터 100일동안 다이어트를 한다고 했을 때 다이어트가 끝나는 날을 구하여 출력
		
		Calendar c = Calendar.getInstance();
		
		int d_day = 100;
//		int day = c.get(Calendar.DATE);
//		c.set(Calendar.DATE, day + d_day - 1);
		
		c.add(Calendar.DATE, d_day - 1);
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
		
	}
	
}
