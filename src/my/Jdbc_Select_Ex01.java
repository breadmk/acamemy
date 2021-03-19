package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_Select_Ex01 {

	public static void main(String[] args) {
//		각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		PreparedStatement psmt = null;
		ResultSet rs = null;
//		1)드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결성공");
//		2)Connection 객체 얻기
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("객체얻기 성공");
//		3)실행 객체 생성  PreparedStatement객체,Statement객체
			String sql = "select sno,loc,hp,grade from school";
			psmt = conn.prepareStatement(sql);
//		3-2)쿼리문 실행
			rs = psmt.executeQuery();
				
			if(rs!=null) {
				while(rs.next()) {
				 SchoolDTO sDTO = new SchoolDTO();
				 sDTO.setSno(rs.getInt("sno"));
				 sDTO.setLoc(rs.getString("loc"));
				 sDTO.setHp(rs.getString("hp"));
				 sDTO.setGrade(rs.getString("grade"));
				 System.out.println(sDTO.toString());
				}
			}
		}catch(Exception e ) { 
		}finally { 
			try {
				if(psmt!=null) {
					psmt.close();
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