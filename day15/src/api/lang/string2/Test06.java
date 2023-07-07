package api.lang.string2;

public class Test06 {
	public static void main(String[] args) {
		//반드시 1개를 포함해야 되는 경우에 대한 검사
		//?= 긍정탐색 , ?!부정탐색 , . 아무거나 , * 0개이상
		String password = "Khuser1234!";
		
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,16}$";
		
		System.out.println(password.matches(regex));
	}
}
