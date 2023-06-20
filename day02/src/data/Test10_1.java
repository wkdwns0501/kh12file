package data;

public class Test10_1 {
	public static void main(String[] args) {
		//Test10을 사람이 푸는 방식으로 풀이(권장하지않음)
		
		//입력
		int yHour = 2, yMin = 45;
		int tHour = 1, tMin = 50;
		
		//계산
		int totalMin = (yMin + tMin) % 60;
		int totalHour = yHour + tHour + (yMin + tMin) / 60;
		
		//출력
	    System.out.println(totalHour);
	    System.out.println(totalMin);
	}

}
