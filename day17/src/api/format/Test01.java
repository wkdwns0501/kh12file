package api.format;

import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;

public class Test01 {
	public static void main(String[] args) {
		//DeciamlFormat
		//= 10진수를 출력하는 형식 클래스
		//= 0은 자리수를 확보할 때 필요한 기호 (소수점), 숫자가 없어도 0이 나옴
		//= #은 0인 경우는 자리를 출력하지 않음
		//= 콤마는 한개만 작성해도 패턴으로 인식됨
		
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		
		double a = 1234.56789;
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		System.out.println(fmt.format(a));
	}
}
