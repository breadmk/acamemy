package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Member_SelectTest02_2 {
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
//				여기에서는 member테이블의 값을 가져와서 MemberDTO클래스의 setmNO()메서드 파라미터로 제공하면
				//4. 추가작업
//				MemberDTO 클래스의 필드에 데이터가 세팅된다.
				MemberDTO mDTO = new MemberDTO();
			    mDTO.setmNo(rs.getInt("mno"));
				mDTO.setmName(rs.getString("mname"));
				mDTO.setmId(rs.getString("mid"));
				mDTO.setmPwd(rs.getString("mpwd"));
				mDTO.setData(rs.getDate("mdate"));
				System.out.println(mDTO.toString());
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
