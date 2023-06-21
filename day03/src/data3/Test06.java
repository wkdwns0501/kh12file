package data3;

public class Test06 {
	public static void main(String[] args) {
		//어떤 두 자리 이하의 수(ex : 95)가 주어졌을 때
		//이 숫자에 3, 6, 9가 포함되어 있는지 판정 후 출력하세요
		//(369 게임에서 박수치는 숫자인지 아닌지 판정), (3,6,9의 배수가 아니라 3,6,9가 들어가는 수)
		
		int num = 95;
		
		int ten = num / 10;
		int one = num % 10;
		
		boolean alpha = ten == 3 || ten == 6 || ten == 9;
		boolean beta = one == 3 || one == 6 || one == 9;
		
		boolean clap = alpha || beta;
		
		System.out.println(clap);
		
	}
}
