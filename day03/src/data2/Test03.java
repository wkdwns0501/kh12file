package data2;

public class Test03 {
	public static void main(String[] args) {
		//KH 주유소에서는 휘발유를 1L에 1530원에 팔고 있습니다.
		//50000원 주유했을 때 주유되는 휘발유의 양을 출력하세요
		
		//입력
		int price = 1530;
		int pay = 50000;
		
		//계산
		//int gasoline = pay / price;
		//double gasoline = pay / price;
		double gasoline = (double)pay / price;
		
		//출력
		System.out.println(gasoline);
	}
}
