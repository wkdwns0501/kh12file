package opp.test2;

public class Test01 {
	public static void main(String[] args) {
		//PokeMon의 객체(인스턴스)를 생성
		
		//생성
		PokeMon a = new PokeMon();
		PokeMon b = new PokeMon();
		PokeMon c = new PokeMon();
		PokeMon d = new PokeMon();
		
		//초기화
		a.num = 1;
		a.name = "이상해씨";
		a.attribute = "풀";
		
		b.num = 4;
		b.name = "파이리";
		b.attribute = "불꽃";
		
		c.num = 7;
		c.name = "꼬부기";
		c.attribute = "물";
		
		d.num = 25;
		d.name = "피카츄";
		d.attribute = "전기";
		
		//출력 //반복문 사용불가
		System.out.print("번호" + "\t");
		System.out.print("이름" + "\t");
		System.out.println("속성");
		
		System.out.print(a.num + "\t");
		System.out.print(a.name + "\t");
		System.out.println(a.attribute);
		
		System.out.print(b.num + "\t");
		System.out.print(b.name + "\t");
		System.out.println(b.attribute);
		
		System.out.print(c.num + "\t");
		System.out.print(c.name + "\t");
		System.out.println(c.attribute);
		
		System.out.print(d.num + "\t");
		System.out.print(d.name + "\t");
		System.out.println(d.attribute);
	}
}