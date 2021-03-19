package KangMinGyu;

public class AccountExample {

	public static void main(String[] args) {
		
		Account money = new Account();
		money.setBalance(10000);
		System.out.println("현재 잔고 = "+ money.getBalance(50000));
	}

}
