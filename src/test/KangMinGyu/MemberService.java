package test.KangMinGyu;

public class MemberService {
	
//	field	[접근제어자][속성]데이터타입 변수명 = [초기값];
	
//	constructor	[접근제어자]클래스명([매개변수리스트]){}
	
//	method	[접근제어자][속성]리턴유형 메소드명([매개변수리스트]){}
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout() {
		System.out.println("로그아웃되었습니다.");
	
	}
}
