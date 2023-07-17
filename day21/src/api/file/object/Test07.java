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

public class Test07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		File target2 = new File("sample/player.kh");
		Player p;
		
		FileOutputStream stream2 = new FileOutputStream(target2);
		BufferedOutputStream buffer2 = new BufferedOutputStream(stream2);
		ObjectOutputStream obj2 = new ObjectOutputStream(buffer2);
		
		obj2.writeObject(p);
		obj2.close();
		
//		File target = new File("sample/player.kh");
//		
		if(target2.exists()) {
			FileInputStream stream = new FileInputStream(target2);
			BufferedInputStream buffer = new BufferedInputStream(stream);
			ObjectInputStream obj = new ObjectInputStream(buffer);
			p = (Player) obj.readObject();
			obj.close();
		}
		else {
			System.out.println("게임 시작!");
			System.out.print("아이디를 설정하세요 : ");
			String id = sc.next();
			p = new Player(id);
		}
		while(true) {
			System.out.print("입력 (1-정보출력/2-레벨업/3-종료) : ");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("아이디 : " + p.getId());
				System.out.println("레벨 : " + p.getLevel());
				System.out.println("소지금 : " + p.getMoney() + " gold");
			}
			else if (num == 2) {
				p.getLevelUp();
				System.out.println("레벨이 1 증가했습니다!");
			}
			else if (num == 3) {
				
				System.out.println("정보를 저장하였습니다");
				System.out.println("프로그램을 종료합니다"); 
				break;
			}
		
		}
		p.show();
		sc.close();
	}
}
