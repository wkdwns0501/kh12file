package oop.constructor3;

public class Character {
	String id, occ;
	int level;
	
	void setId(String id) {
		this.id = id;
	}
	void setOcc(String occ) {
		switch(occ) {
		case "전사":
		case "마법사":
		case "궁수":
			this.occ = occ;
		}
	}
	void setLevel(int level) {
		if(level < 1 ) return;
		this.level = level;
	}
	
	String getId() {
		return id;
	}
	String getOcc() {
		return occ;
	}
	int getLevel() {
		 return level;
	}
	//생성자 - 생성 시 필요한 데이터를 강제하는 도구
	Character (String id, String occ){
		this(id, occ, 1);
	}
	Character (String id, String occ, int level){
		this.setId(id);
		this.setOcc(occ);
		this.setLevel(level);
	}
	
	void show() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.getId());
		System.out.println("직업 : " + this.getOcc());
		System.out.println("레벨 : " + this.getLevel());
	}
}
