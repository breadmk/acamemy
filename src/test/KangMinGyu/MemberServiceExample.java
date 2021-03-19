package test.KangMinGyu;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("hong","12345");
		boolean result1 = ms.login("hong", "54321");
		if(result) {
			System.out.println("로그인 되었습니다.");
		}
		if(!result1){
			ms.logout();
			System.out.println("id와 password 를 확인하세요.");
		}
		
	}

}
