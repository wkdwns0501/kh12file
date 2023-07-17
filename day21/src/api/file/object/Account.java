package api.file.object;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private long money;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(long money) {
		if(money<0) return;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public long getMoney() {
		return money;
	}
	public Account(String name) {
		this.setName(name);
		this.setMoney(0L);
	}
	public long getDeposit() { //입금
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 : ");
		long deposit = sc.nextLong();
		return this.money += deposit ;
	}
	public long getWithdraw() { //출금
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력 : ");
		long withdraw = sc.nextLong();
		if(money < withdraw) {
			System.out.println("잔액이 부족합니다!");
			return withdraw;
		}
		else return this.money -= withdraw;
	}
	public void show() {
		System.out.println("<계좌 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.money + "원");
	}
	
}
