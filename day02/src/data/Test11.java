package data;

public class Test11 {
	public static void main(String[] args)  {
		//PC방에서 게임을 9시 40분에 시작해서 12시 25분까지 했습니다
		//한 시간당 1200원일 때 이용요금과 이용시간을 각각 출력하세요
		
		//입력
		int startHour = 9, startMin =  40;
		int endHour = 12, endMin = 25;
		
		//계산
		int startTime = startHour * 60 + startMin;
		int endTime = endHour * 60 + endMin;
		
		int useTime = endTime - startTime;
		//System.out.println(useTime);
		
		int useHour = useTime / 60;
		int useMin = useTime % 60;
		
		//출력
		System.out.println(useHour);
		System.out.println(useMin);
		//내꺼
		/*int startHour = 9, startMin = startHour * 60 + 40;
		int finishHour = 12, finishMin = finishHour * 60 + 25;
		int useMin = finishMin - startMin;
		int useHour = useMin / 60;
		int userestMin = useMin  % 60;
		int minPay = 1200 / 60;
		int usePay = useMin * minPay;
		
		System.out.println(useHour);
		System.out.println(userestMin);
		System.out.println(usePay); */
		
	}
}
