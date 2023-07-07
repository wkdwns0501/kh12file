package api.lang.string2;

public class Test05_1 {
	public static void main(String[] args) {
		//큰달/작은달/2월을 프로그래밍으로 구분
		
				String birth = "1999-04-31";
				
				String regex;
				if(birth.contains("-02-")) {//2월
					regex = "^(19[0-9]{2}|20[0-9]{2})-(02)-(0[1-9]|1[0-9]|2[0-9])$";
				}
				else if(birth.contains("-04-") || birth.contains("-06-") 
						|| birth.contains("-09-") || birth.contains("-11-")) {
					regex = "^(19[0-9]{2}|20[0-9]{2})-(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)$";
				}
				else {
					regex = "^(19[0-9]{2}|20[0-9]{2})-(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
				}
				
				if(birth.matches(regex)) {
					System.out.println("올바른 생년월일");
				}
				else {
					System.out.println("잘못된 생년월일");
				}
				
	}
}
