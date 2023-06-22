package input;

import java.util.Scanner; //자동 import는 Ctrl + Shift + O 로 합니다

public class Test06 {
	public static void main(String[] args) {
		//문자열 입력
		//.next() 명령으로 띄어쓰기 전까지 입력 (띄어쓰기 뒤에는 출력되지않음)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("입력한 이름 = " + name);
		
		sc.close();
	}

}
