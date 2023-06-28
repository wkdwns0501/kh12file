package array;

public class Test02 {
	public static void main(String[] args) {
		//1.5, 2.4, 3.6을 저장하기 위한 배열을 생성하고 데이터를 저장한 뒤 출력하세요
		//배열 생성
		//data ----> [0.0][0.0][0.0]
		double []data = new double[3];
		
		data[0] = 1.5; 
		data[1] = 2.4; 
		data[2] = 3.6;
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
	}
}