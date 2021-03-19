package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement 객체 이용 : 쿼리문을 미리 전달하여 나중에 실행.
public class InsertTest01 {
	public static void main(String[] args) {
		
//		각종 필요한 변수선언 예) conn,stmt,pstmt,rs,sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//		1)드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
//		2)Connection 객체를 얻기
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("객체얻기성공");
			
//		3-1)실행객체      PreparedStatement객체 : conn.prepareStatement(sql),/쿼리문먼저줘야함.
//					 Statement 객체 : conn.createStatement() 
			String sql = "insert into emp(empno,ename,sal,hiredate) " 
				       + " values(eno_seq.nextval,'홍1',3000,sysdate)";
			
			conn.prepareStatement(sql);
			
			pstmt = conn.prepareStatement(sql);
//		3-2)쿼리문실행 - executeUpdate() :insert,update,delete
//				      executeUpdate()의 리턴형태는 int
//					  executeQuery() : select
//					  executeQuery()의 리턴 형태는 ResultSet
			int cnt = pstmt.executeUpdate();
			System.out.println("확인용 insert 실행결과수 row수= "+cnt);
//		4)추가작업
			if(cnt>0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력되지 않았습니다.");
			}
//		5)사용한 객체 반납(필수) : 객체.close();
		
		}catch(Exception e) { 
				System.out.println("쿼리실행관련 에러발생="+e);
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

