package data;

public class Test09 {
	public static void main(String[] args) {
		//한 달에 200만원씩 30년을 모으면 얼마인지 계산하여 출력
		
		//입력 //만약 int의 범위를 넘어간다고하면
		int money = 2000000; // long money = 20000000000L;
		int year = 30;
		
		//계산
		int month = year * 12;
		int  totalMoney = money * month ; // long totalMoney = money * month; 
		// money나 month 둘중에 하나라도 long 의 범위이면 totalMoney도 long으로 바뀌어야 한다
		
		//출력
		System.out.println(totalMoney);
	}
}