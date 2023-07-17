package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AccountUtil {
	public static Account load() throws ClassNotFoundException, IOException {
		Account account;
		String name = null;
		File target = new File("sample/bank.kh");
		System.out.println("KH 은행에 오신 것을 환영합니다!");
		
		if(target.exists()) {
			FileInputStream stream = new FileInputStream(target);
			BufferedInputStream buffer = new BufferedInputStream(stream);
			ObjectInputStream obj = new ObjectInputStream(buffer);
			account = (Account) obj.readObject();
			obj.close();
			System.out.println(name + "님 환영합니다");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("처음 방문하셨습니다!");
			System.out.print("이름 입력 : ");
			name = sc.next();
			account = new Account(name);
			System.out.println(name + "님 환영합니다");
		}
		return  account;
	}
	public static void save(Account account) throws IOException {
		File target = new File("sample/bank.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		
		obj.writeObject(account);
		obj.close();
	}
	public static void execute() throws ClassNotFoundException, IOException {
		Account account = AccountUtil.load();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 (1-정보출력/2-입금/3-출금/0-종료) : ");
			int num = sc.nextInt();
			if(num == 1) { account.show(); }
			else if(num == 2) { account.deposit(); }
			else if(num == 3) { account.withdraw(); }
			else if(num == 0) {
				System.out.println("저장 후  프로그램을 종료합니다!");
				break;
			}
		}
		sc.close();
		AccountUtil.save(account);
	}
}
