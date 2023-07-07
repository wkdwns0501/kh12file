package api.lang.string2;

public class Test01 {								//https://regexper.com/
	public static void main(String[] args) {	//[가-힣]  -> 한글 한글자
		//문자열의 구체적인 검사					//[가-힣]{3} -> 한글 한글자 x 3 -> 한글 세글자
															//[0-9]   -> 숫자 한글자
															//[A-Z]   -> 영어 대문자 한글자
		String name = "홍길동";					//[A-Za-z]  -> 영어 대/소문자 한글자
															//^[가-힣]{2,7}$ : 최종형태
		//(Q) 올바른 이름 형식인가요?
		//[1] 모든 글자는 한글로 이루어져 있어야 한다
		//		글자수 == 한글개수
		//[2] 이름은 2~7글자로 이루어져 있어야 한다
		int count = 0;
		
		for(int i = 0 ; i < name.length() ; i++) {
			char ch = name.charAt(i);
			if(ch >= '가' && ch <= '힣') {
				count++;
			}
		}
		boolean condition1 = name.length() == count;
		boolean condition2 = name.length() >= 2 && name.length() <=7;
		
		System.out.println(condition1 && condition2);
	}
}
