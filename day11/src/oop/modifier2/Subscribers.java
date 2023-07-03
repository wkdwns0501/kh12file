package oop.modifier2;

public class Subscribers {
	private String name;
	private int period, count, money;
	private long bal;
	//this 필드의 값
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
		if(count < 0) return;
		else this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setMoney(int money) {
		if (money % 10000 != 0) return;
		else this.money = money;
	}
	public long getMoney() {
		return money;
	}
	public void setBal(long bal) {
		if(bal < 0) return;
		else this.bal = bal;
	}
	public long getBal() {
		return bal;
	}
	public String getFin() {
		if(this.period * 12 < this.count) return " (만기)";
		else return "";
	}
	public Subscribers(String name, int period, int money, long bal) {
		this(name, period, 1, money, bal);
	}
	public Subscribers(String name, int period, int count, int money, long bal) {
		this.setName(name);
		this.setPeriod(period);
		this.setCount(count);
		this.setMoney(money);
		this.setBal(bal);
	}
	
	public void show() {
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		System.out.println("예금주 이름 : " + this.getName());
		System.out.println("총납입 기간 : " + this.getPeriod() + "년");
		System.out.println("현재납입 회차 : " + this.getCount() + "회차" + this.getFin());
		System.out.println("월납입 금액 : " + this.getMoney() + "원");
		System.out.println("총잔액 : " + this.getBal() + "원");
		
	}
}
