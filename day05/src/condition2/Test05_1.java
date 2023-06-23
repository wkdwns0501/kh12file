package condition2;

public class Test05_1 {
	public static void main(String[] args) {
		
		//입력
		int time = 75;
		
		//출력
		if(time < 10) {//10초 미만
			System.out.println("방금 전");
		}
		else if(time < 1 * 60) {//1분 미만
			System.out.println(time + "초 전");
		}
		else if(time < 1 * 60 * 60) {//1시간 미만
			System.out.println(time / 60 + "분 전");
		}
		else if(time < 1 * 24 * 60 * 60) {//1일 미만
			System.out.println(time / 60 / 60 + "시간 전");
		}
		else if(time < 1 * 365 * 24 * 60 * 60) {//1년 미만
			System.out.println(time / 60 / 60 / 24 + "일 전");
		}
		else {
			//System.out.println(time / 60 / 60 / 24 / 365 + "년 전");
			System.out.println("오래 전");
		}
		
	}
}