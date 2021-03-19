package KangMinGyu;

public class MemberService {
	
//	field	[����������][�Ӽ�]������Ÿ�� ������ = [�ʱⰪ];
	
//	constructor	[����������]Ŭ������([�Ű���������Ʈ]){}
	
//	method	[����������][�Ӽ�]�������� �޼ҵ��([�Ű���������Ʈ]){}
	
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
