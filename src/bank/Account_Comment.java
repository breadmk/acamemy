package bank;

public class Account_Comment {
	
	//field
	private String accnum;	//계좌번호
	private String accjuin;	//계좌주
	private  int jango;		//초기입금액,잔고

	//constructor
	
	public Account_Comment(String accnum, String accjuin, int jango) {  //필드 초기화
		this.accnum=accnum;
		this.accjuin=accjuin;
		this.jango=jango;
	}
	//method
	public String getaccnum() {	return accnum; }
	public void setaccnum(String accnum) { this.accnum=accnum;}
	public String getjuin() { return accjuin;}
	public  void sethjuin(String accjuin) {this.accjuin=accjuin;	}
	public  int getjango() {	return jango;	}
	public  void setjango(int jango) {this.jango=jango;}
	
}
