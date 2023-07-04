package oop.modifier2;

public class Savings {
	private String name; //예금주명
	private int period, count, money, bal; //총기간, 진행된 입금회차, 1회 입금액, 잔액
	//this가붙으면 필드의 값, 안붙으면 바로 위에값
	void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPeriod(int period) {
		switch(period) {
		case 1:
		case 2:
		case 3:
		case 5:
		case 10:
			this.period = period;
		}
	}
	public int getPeriod() {
		return period;
	}
	public void setCount(int count) {
		if(count < 1) return;
		if(count >this.getTotal()) return;
		else this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setMoney(int money) {
		if (money <= 0) return;
		this.money = money;
	}
	public long getMoney() {
		return money;
	}
	public void setBal(int bal) {
		if(bal <= 0) return;
		else this.bal = bal;
	}
	public int getBal() {
		return bal;
	}
	//만기인지 아닌지 판정하는 메소드
	//(참고) 논리가 반환값인 Getter 메소드 get이 아니라 is로 시작하게 작명
	public boolean isFin() {
//		if(this.getTotal() == this.getCount()) return true;
//		else return false;
		return this.getTotal() == this.getCount();
	}
	public int getMonth() {
		return this.period * 12;
	}
	public int getTotal() {
		return this.getMonth() + 1;
	}
	
	public Savings(String name, int period, int money) {
		this(name, period, money, 1, 0);
	}
	public Savings(String name, int period, int money, int count, int bal) {
		this.setName(name);
		this.setPeriod(period);
		this.setMoney(money);
		this.setCount(count);
		this.setBal(bal);
	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주 이름 : " + this.getName());
		System.out.println("예치 기간 : " + this.getPeriod() + "년 (" + this.getMonth() + "개월)");
		System.out.println("현재납입 회차 : (" + this.getCount() + " / " + this.getTotal() + ")");
		System.out.println("월부금 : " + this.getMoney() + "원");
		System.out.println("계좌 잔액 : " + this.getBal() + "원");
		if(this.isFin()) {
			System.out.println("* 해당 적금은 만기되었습니다. *");
		}
	}
}
