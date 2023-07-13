package api.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test05 {
	public static void main(String[] args) {
		//집합 연산 문제 //순서가 중요하면 리스트를 써야한다
		Set<String> a = Set.of("범죄도시3","늑대사냥","드림", "퍼펙트게임");
		Set<String> b = Set.of("파수꾼","늑대사냥","리바운드", "익스트랙션2", "드림");
		
		//둘 다 본 영화 (교집합)
		Set<String> inter = new HashSet<>();
		inter.addAll(a);
		inter.retainAll(b);
		System.out.println("둘 다 본 영화 : " + inter);
		
		//둘 중 한명만 본 영화
		//(1) (a - b) ∪ (b - a)
		//(2) (a ∪ b) - (a ∩ b)
		
		//(1)
//		Set<String> a_b = new HashSet<>();
//		a_b.addAll(a);
//		a_b.removeAll(b);
//		Set<String> b_a = new HashSet<>();
//		b_a.addAll(b);
//		b_a.removeAll(a);
//		Set<String> result1 = new HashSet<>();
//		result1.addAll(a_b);
//		result1.addAll(b_a);
//		System.out.println("둘 중 한명만 본 영화 = " + result1);
		
		//(2)
		Set<String> union = new HashSet<>();
		union.addAll(a);
		union.addAll(b);
		
		union.removeAll(inter);
		System.out.println("둘 중에 한 명만 본 영화 : " + union);
		
		//Set도 저체 출력이 되긴 된다
		//= 확장반복(foreach)은 가능
		
		for(String name : union) {
			System.out.println("name = " + name);
		}
	}
}
