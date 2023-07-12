package api.util.random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//시드를 제어하여 랜덤을 조작하는 프로그래밍
		//ex) OTP(One Time Password)
		//= 검사하는 서버와 입력하는 사용자가 동일한 랜덤값을 가져야 한다
		
		//서버 (검사)
		Random r = new Random();
		String serial = "0000-0000-0000-0000";
		
		long seed = System.currentTimeMillis() / 60000; //60초
		seed += serial.hashCode();
		r.setSeed(seed); //랜덤숫자가 같으려면 시드가 같아야함
		int otp = r.nextInt(1000000) + 0;
		DecimalFormat fmt = new DecimalFormat("000000");
//		System.out.println("클라이언트 = " + otp);
		System.out.println("서버 = " + fmt.format(otp));
	}
}
