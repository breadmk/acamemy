package test.KangMinGyu;

public class Account {
	
//	field	[접근제어자][속성]데이터타입 변수명 = [초기값];
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
//	constructor	[접근제어자]클래스명([매개변수리스트]){}
	
//	method	[접근제어자][속성]리턴유형 메소드명([매개변수리스트]){}
	 boolean balance(int values) {
		if(0<values && values<=1000000) {
			return true;
		}else {
			return false;
		}
	}
	 int setBalance(int balance) {
		 this.balance = balance;
		 if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			System.out.println(balance);
			return balance;
	 	}else {
	 		System.out.println("금액이 맞지 않습니다.");
	 		return balance;
	 	}
	
	 }
	 
	int getBalance(int balance) {
		return balance;	
	 }
	 
}
	

