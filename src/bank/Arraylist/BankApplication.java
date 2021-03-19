package bank.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			int select = sc.nextInt();
			
			if(select == 1) {
				createAccout();
				break;
//			}else if(select == 2) {
//				accountList();
//			}else if(select == 3) {
//				deposit();
//			}else if(select == 4) {
//				withdraw();
//			}else if(select == 5) {
//				System.out.println("프로그램 종료");
//				break;
			}
		}
		
	}
	private static void createAccout() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String num = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		String money = sc.next();
		
	}

}
