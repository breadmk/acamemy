package ch08;

// 잔고 입금 출금 100 200
public class Account01 {

	private long balance;	//잔고
	
	//생성자
	public Account01() {
		
	}
	
//	잔고조회
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
//		balance=balance+입금액
		balance=balance+money; //balance += money;
	}
	
	//출금 =>throws BalanceInsufficientException => 사용자정의 예외 떠넘기기
	public void withDraw(int money) throws BalanceInsufficientException {
//		잔고=기존잔고-출금액;
		if(balance < money) {
			//사용자 정의 예외 발생
			throw new BalanceInsufficientException("잔고가 부족: "+(money-balance)+"원이 부족합니다."); //재보험필요
		}
		balance = balance-money;	//balance -= money;
	}
}






