package other.YiSeungJun;

import java.util.Scanner;

public class BankApplication extends Account {

	public Scanner scan = new Scanner(System.in);
	public int menu;
	public boolean stat = false;

	public BankApplication() {
		super();
	}

	public static void main(String[] args) {
		BankApplication app = new BankApplication();

		
		while (app.start());
	}

	private boolean start() {
		this.stat = true;
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료\n");
		System.out.printf("----------------------------------------------------------\n");
		System.out.printf("선택>");

		if (!this.checkInt()) {
			this.start();
			return this.stat;
		}

		this.menu = scan.nextInt();
		this.setMenu();

		return this.stat;
	}

	private void setMenu() {
		switch(this.menu) {
			case 1 :
				this.setAccount();
				break;
			case 2 :
				this.getList();
				break;
			case 3 :
				this.deposit();
				break;
			case 4 :
				this.withdraw();
				break;
			case 5 :
				this.end();
				break;
		};
	}

	private void end() {
		this.stat = false;
		this.scan.close();
		System.out.println("프로그램 종료");
	}

	private void setAccount() {
		System.out.printf("------------\n");
		System.out.printf("계좌생성\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("계좌주 : ");
		String b = this.scan.next();
		System.out.printf("초기입금금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		int c = this.scan.nextInt();

		if (c <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");			
		} else {
			this.accList.add(new Account(a, b, c));
			System.out.printf("결과: 계좌가 생성되었습니다.\n");
		}

		this.start();
		
	};

	private void getList() {
		int i = 0;

		System.out.printf("------------\n");
		System.out.printf("계좌목록\n");
		System.out.printf("------------\n");

		if (this.accList.size() > 0) {
			for (Account a : this.accList)
				System.out.printf("%s       %s       %d\n",a.getACCNO(), a.getACNAME(), a.getBalance());
		} else {
			System.out.printf("등록된 계좌가 없습니다\n");
		}

		i++;
		this.start();
	}

	private void deposit() {
		System.out.printf("------------\n");
		System.out.printf("예금\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("예금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		int b = this.scan.nextInt();

		if (b <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");
		} else {
			Account acc =  this.searchAccount(a, b);
			if (acc == null) {
				System.out.printf("결과 : 해당 계좌정보가 없습니다.\n");
				this.start();
				return;
			}
			
			acc.setBalance(acc.getBalance() + b);
			System.out.printf("결과 : 예금이 성공되었습니다.\n");
		}

		this.start();
	}

	private void withdraw() {
		System.out.printf("------------\n");
		System.out.printf("출금\n");
		System.out.printf("------------\n");
		System.out.printf("계좌번호 : ");
		String a = this.scan.next();
		System.out.printf("출금액 : ");

		if (!this.checkInt()) {
			this.start();			
			return;
		}

		int b = this.scan.nextInt();

		if (b <= 0) {
			System.out.printf("결과: 0원보다 큰 금액을 입금하세요.\n");
		} else {
			Account acc =  this.searchAccount(a, b);
			if (acc == null) {
				System.out.printf("결과 : 해당 계좌정보가 없습니다.\n");
				this.start();
				return;
			}
			
			int balance = acc.getBalance();
			if (balance < b) {
				System.out.printf("결과 : 잔액이 부족합니다.\n");
			} else {
				acc.setBalance(balance - b);
				System.out.printf("결과 : 출금이 성공되었습니다.\n");			
			}			
		}

		this.start();
	}

	private boolean checkInt() {
		boolean result = true;

		if (!this.scan.hasNextInt()) {
			result = false;
			System.out.println("숫자를 입력하세요");
			this.scan.next();
		}

		return result;
	}

}