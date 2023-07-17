package api.file.object;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private long money;
	
	public void setName(String name) {
		if(!name.matches("^[가-힣]{2,7}$")) return;
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
	public void deposit() { //입금
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 : ");
		long deposit = sc.nextLong();
		if(deposit <= 0) {
			System.out.println("입금할 수 없습니다!");
			return;
		}
		else {
			this.money += deposit ;
			System.out.println(deposit + "원이 정상적으로 입금되었습니다!");
		}
	}
	public void withdraw() { //출금
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력 : ");
		long withdraw = sc.nextLong();
		if(money < withdraw || withdraw <=0) {
			System.out.println("출금할 수 없습니다!");
			return ;
		}
		else {
			this.money -= withdraw;
			System.out.println(withdraw + "원이 정상적으로 출금되었습니다!");
		}
	}
	public void show() {
		System.out.println("<계좌 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.money + "원");
	}
	
}
