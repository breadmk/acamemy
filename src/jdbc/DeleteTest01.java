package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest01 {

	public static void main(String[] args) {
		 //각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버로딩 완료");
			
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connection 객체 얻기 성공");
			
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql ="delete from emp "
					   + " where empno=8000";
			pstmt = conn.prepareStatement(sql);
			
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			int cnt = pstmt.executeUpdate();
			System.out.println("확인용 delete 실행결과수 row수= "+cnt);
//		4)추가작업
			if(cnt>0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력되지 않았습니다.");
			}
		}catch(Exception e) { 
		}finally { 
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
					}
				}catch(Exception e) {
					e.printStackTrace();
		}
	}
}
}
