package ch08;

//Accout01 클래스를 사용하는 실행클래스.
public class Account_Ex2 {

	public static void main(String[] args) throws BalanceInsufficientException {
		Account01 ac = new Account01();
		
		//입금하기
		ac.deposit(1000000);
		
		//잔고확인
		System.out.println("잔고는 : " +ac.getBalance());
		
		//출금하기
		ac.withDraw(300);
		System.out.println("출금 후 잔고 :"+ac.getBalance());
	}

}
