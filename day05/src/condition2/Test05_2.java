package condition2;

public class Test05_2 {
	public static void main(String[] args) {
		
		//입력
		int time = 75;
		
		//계산
		//String result = "방금전" or "?초전" or "?분전" or "?시간 전" or "?일전" or "오래전";
		String result;
		if(time < 10) {  					
			result = "방금 전";
		}
		else if(time < 1 * 60) {
			result = time + "초 전";
		}
		else if(time < 1 * 60 * 60) { 
			result = time / 60 + "분 전";
		}
		else if(time < 1 * 24 * 60 * 60) {
			result = time / 60 / 60 + "시간 전";
		}
		else if(time < 1 * 365 * 24 * 60 * 60) {
			result = time / 24 / 60 / 60  +"일 전";
		}
		else {
			result = "오래 전";
		}
		
		//출력
		System.out.println(result);
	}
}