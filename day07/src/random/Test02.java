package random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) { // 주석 단축키 : Ctrl + Shift + C
//		다음 요구하는 랜덤값을 구하여 화면에 출력하도록 코드를 구현하세요
		Random r = new Random();
//		1.무작위 로또 번호 1개
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 번호 : " + lotto);
		
//		2.무작위 두 자리 정수 1개
		int num = r.nextInt(90) + 10;
		System.out.println("두자리 정수 : " + num);
		
//		3.무작위 OTP 번호 1개(OTP 번호는 총 6자리로 구성되어 있습니다)
		int OTP = r.nextInt(1000000);
		System.out.println("OTP : " + OTP);
		Format f = new DecimalFormat("000000");
		System.out.println("OTP : " + f.format(OTP));
		
//		4.무작위로 앞/뒤 출력
		int coin = r.nextInt(2); // 뒤에 + 안붙는걸 선호
		if (coin == 0) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
		
//		5.무작위로 가위/바위/보 출력 
		int rsp = r.nextInt(3);
		if (rsp == 0) {
			System.out.println("가위");
		}
		else if (rsp == 1) {
			System.out.println("바위");
		}
		else {
			System.out.println("보");
		}
	}
}
