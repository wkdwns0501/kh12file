package data;

public class Test10 {
	public static void main(String[] args)  {
		//시간은 가장 작은 단위로 변환하여 푼다
		
		//입력
		int yHour = 2, yMin = 45;
		int tHour = 1, tMin = 50;
		
		//계산
		int yTime = yHour * 60 + yMin;
		int tTime = tHour * 60 + tMin;
		
		int time = yTime + tTime;
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
	    System.out.println(hour);
	    System.out.println(minute);
	}
}
