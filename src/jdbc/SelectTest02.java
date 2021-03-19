package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class SelectTest02 {
	public static void main(String[] agrs) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버로딩 완료");
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connection 객체 얻기 성공");
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "select mno,mname,mid,mpwd,mdate  "
					+ " from member";
				
			
			pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			if(rs!=null) {
			while(rs.next()) {
			int mno= rs.getInt("mno");
			String mname = rs.getString("mname");
			String mid = rs.getString("mid");
			String mpwd = rs.getString("mpwd");
			Date mdate = rs.getDate("mdate");
			//4. 추가작업
			System.out.printf("%4d %15s %15s %15s %s\n",mno,mname,mid,mpwd,mdate);
			}
			}
		}catch(Exception e ) { 
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
