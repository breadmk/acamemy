package ch08;

//Accout01 클래스를 사용하는 실행클래스.
public class Account_Ex {

	public static void main(String[] args) {
		Account01 ac = new Account01();
		
		//입금하기
		ac.deposit(1000000);
		
		//잔고확인
		System.out.println("잔고는 : " +ac.getBalance());
		
		//출금하기
		try {
			ac.withDraw(1000001);
		} catch (BalanceInsufficientException e) {
			String msg=e.getMessage();
			System.out.println("예외메세지 : "+msg);
			System.out.println();
			e.printStackTrace();
		}finally {
			
			System.out.println("출금 후 잔고 :"+ac.getBalance());
		}
		
	}

}
