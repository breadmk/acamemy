package other.YiSeungJun;

import java.util.ArrayList;

public class Account {

	protected ArrayList accList = new ArrayList();
	final private String ACCNO;
	final private String ACNAME;
	private int balance;

	public Account() {
		this.ACCNO = "";
		this.ACNAME = "";
		this.balance = 0;

		if (accList == null)
			this.accList = new ArrayList();
	};

	public Account(String accno, String acname, int balance) {
		this.ACCNO = accno;
		this.ACNAME = acname;
		this.balance = balance;
	}

	public void setBalance(int deposit) {
		this.balance = deposit;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public String getACCNO() {
		return this.ACCNO;
	}

	public String getACNAME() {
		return this.ACNAME;
	}

	public Account searchAccount(String accno, int deposit) {
		Account acc = null;

		for (Object a : this.accList) {
			Account o = (Account)a;
			String acno = o.getACCNO();

			if (acno.equals(accno)) {
				acc = o;
				break;
			}
		}

		return acc; 
	}

}