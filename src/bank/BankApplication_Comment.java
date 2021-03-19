package bank;

import java.util.Scanner;

public class BankApplication_Comment {

	//comment:아래 accountArray, ac가 필드
	private static Account[] accountArray = new Account[10];	//저장공간  10인 배열 10개 이상은 저장X
	static Scanner sc = new Scanner(System.in);					//Scanner 객체 생성.
	static Account ac = new Account("", "", 0);					//Account 클래스 객체 생성.

	public static void main(String[] args) {
		//field //comment: <--- 요넘은 field가 아니죵~~
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			int input = sc.nextInt();
			
			if(input==1) {
				createAccount();
			}else if(input==2) {
				accountList();
			}else if(input==3) {
				 deposit();
			}else if(input==4) {
				withdraw();
			}else {
				exit();
				break;
				} //comment:들여쓰기 주의
	}//comment:들여쓰기 주의. 코드가 길어지면 나중에 보기 불편. 헷갈릴 가능성 높음
			
	}

	//comment: 메서드마다 주석달기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accnum = sc.next();
		System.out.print("계좌주: ");
		String accjuin = sc.next();
		System.out.print("초기입금액: ");
		int jango = sc.nextInt();
		for(int i=0; i<accountArray.length; i++) {	//배열에 저장하기 위해서 for문을 활용.
			if(accountArray[i]==null) {				
				accountArray[i] = new Account(accnum,accjuin,jango);	//배열[i]가 비여있다면  입력값을 저장하기.
				break;
		}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	//comment: 메서드마다 한줄정도의 공백을 넣어주면 가독성이 좋아져요
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int i=0; i<accountArray.length; i++) {	
			if(accountArray[i]==null) {
				break;
		}
		System.out.println(accountArray[i].getaccnum()+"\t"+accountArray[i].getjuin()+"\t"+accountArray[i].getjango());
	}	//배열에 입력된 값 출력하기.
}
	private static Account findAccount(String accnum) {	//입력된 계좌 찾아서 비교하기 위해 생성.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}else if(accountArray[i].getaccnum().equals(accnum)) {	//입력된 계좌의 문자열 비교;
				return accountArray[i];
				
			}
		}
		return null;
	}
	private static void  deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String accnum = sc.next();
		ac = findAccount(accnum);
		if (findAccount(accnum) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			System.out.print("예금액: ");
			int accjango = sc.nextInt();
			int newaccjango = findAccount(accnum).getjango()+accjango;	//새롭게 추가된 예금액 저장.
			ac.setjango(newaccjango);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
		
	}
	private static void withdraw() {			
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("----------");
			System.out.print("계좌번호: ");
			String accnum = sc.next();
			if(findAccount(accnum)==null) {
				System.out.println("계좌가 없습니다.");
			}else {
				System.out.print("출금액: ");
				int oldjango = sc.nextInt();
				ac = findAccount(accnum);
				int newjango = findAccount(accnum).getjango()-oldjango;	//출금된 금액을 새롭게 저장.
				ac.setjango(newjango);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
	}
	private static void exit() {
		System.out.println("프로그램 종료");
		
	}
	
}
