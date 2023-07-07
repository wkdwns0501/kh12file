package api.lang.string;

public class Test05 {
	public static void main(String[] args) {
		//문자열 검사 // prefix 접두사 ,suffix 접미사
		//= 전부 또는 일부분에 대한 검사를 위한 명령
		
		String nick = "운영자입니다운영자";
		
		//운영자가 포함되어 있습니까?
		System.out.println(nick.contains("운영자")); 
		System.out.println(nick.indexOf("운영자") >= 0); // 위의코드랑 동일
		
		//운영자가 어디 있습니까?
		//= 문자열은 배열처럼 0부터 시작하도록 구성되어 있다
		System.out.println(nick.indexOf("운영자")); // 좌측부터 탐색
		System.out.println(nick.lastIndexOf("운영자")); // 우측부터 탐색
		System.out.println(nick.indexOf("없는글자")); //없으면 -1
		
		//시작과 종료 글자 검사
		String url = "https://www.naver.com";
		
		//http가 있는 위치가 0입니까?
		System.out.println(url.indexOf("https") == 0);
		//http로 시작합니까?
		System.out.println(url.startsWith("http"));
		//.com으로 종료합니까?
		System.out.println(url.endsWith(".com"));
		System.out.println(nick.lastIndexOf(".com") == url.length()-".com".length());
		
		//글자의 원하는 위치 추출
		String text = "안녕하세요";
		System.out.println(text.charAt(0)); //0번위치의 글자를 추출
		
		//영어 검사
		char ch = text.charAt(0);
//		boolean isAphabet = (ch >= 65 && ch<=90) || (ch>=97&& ch <=122);
		boolean isAlphabet = (ch >= 'A' && ch<='Z') || (ch >= 'a'&& ch <='z');
		System.out.println("isAlpgabet = " + isAlphabet);
		
		//한글 검사
//		boolean isKorean = ch >= 44032 && ch <= 55203;
		boolean isKorean = ch >= '가' && ch <= '힣';
		System.out.println("isKorean = " + isKorean);
	}
}
