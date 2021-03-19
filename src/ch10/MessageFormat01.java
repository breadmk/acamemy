package ch10;

import java.text.MessageFormat;

//MessageFormat- 교재 p.549 텍스트의 형식화
public class MessageFormat01{

	public static void main(String[] args) {
		//출력할 때
		/*	회원id :
		 * 	회원명 : 
		 *  연락처 : 
		 */
		
		String id ="hongId";
		String name ="홍길동";
		String tel = "010-111-1111";
		String frm = "회원id: {0}\n회원명 : {1}\n연락처 : {2}";
		String result = MessageFormat.format(frm,id,name,tel); //arguments 순서
		System.out.println(result);
		
		Object[] arguments = {"10","막강개발부","서울"};
		String sql = "insert into dept values({0},{1},{2})";
		String result2 = MessageFormat.format(sql,arguments[0],arguments[1],arguments[2]);
		System.out.println(result2);

			
	}

}
