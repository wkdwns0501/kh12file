package array;

public class Test03 {
	public static void main(String[] args) {
		//자바, 파이썬, 루비를 저장하기 위한 배열을 생성하고 데이터를 저장한 뒤 출력하세요
		//data -----> [ null ][ null ][ null ] //문자열은 null이 초기값이다
		String []data = new String[3];
		
		data[0] = "자바";
		data[1] = "파이썬";
		data[2] = "루비";
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
	}
}