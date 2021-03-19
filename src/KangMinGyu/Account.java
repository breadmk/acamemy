package KangMinGyu;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
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
	

