package test.KangMinGyu;

public class AccountExample {

	public static void main(String[] args) {
		
		Account money = new Account();
		money.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í = "+ money.getBalance(50000));
	}

}
