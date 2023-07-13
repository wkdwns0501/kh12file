package api.collection3;

import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
		//Map
		//= 세트 저장소 (key-value 저장소)
		//= List, Set은 한 개의 데이터를 저장하는 반면에 Map은 두개를 세트로 저장
		//= key는 이름(Id - 유일), value는 값(PassWord - 중복 가능)의 역할을 수행
		//= Set에 value가 붙어있는 형태로 봐도 무방
		
//		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		
		//추가 - add가 아니라 put이다 (데이터 개수가 달라서 이름이 다름)
		//key 기준으로 나열
		map.put("유재석", 50);
		map.put("강호동", 53);
		map.put("유재석", 51); //key 중복 (기존 항목의 value가 수정됨 - 50이 사라짐)
		map.put("박명수", 52);
		map.put("정준하", 52); //value 중복 가능
		
		//삭제 - remove
//		map.remove("노홍철"); //없어서 못지움
//		map.remove("박명수");
		
		//추출 - get (key)->value
		System.out.println(map.get("노홍철")); //null
		System.out.println(map.get("박명수")); //52
		
		//검색 - key/value용 contains가 따로 있다
		System.out.println(map.containsKey("유재석")); //key에서 유재석을 찾아라
		System.out.println(map.containsValue(50)); //value에서 50을 찾아라
		
		System.out.println(map);
		System.out.println(map.size());
	}
}
