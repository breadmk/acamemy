package my;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.MemberDTO;

public class Jdbc_Test01 {

	public static void main(String[] args) {
		//각종 필요한 변수선언 - 예)conn, stmt, pstmt, rs, sql
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		PreparedStatement psmts = null;
		ResultSet rs = null;
		//1.드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("1");
			//2.Connection객체얻기
			conn =DriverManager.getConnection(url, user, password);
			System.out.println("2");
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql = "select mno,mname from member ";
			psmts = conn.prepareStatement(sql);
			//3-2.쿼리문실행 -
			rs = psmts.executeQuery();
			if(rs!=null) {
				while(rs.next()){
					MemberDTO mdto = new MemberDTO();
					mdto.setmNo(rs.getInt("mno"));
					mdto.setmName(rs.getString("mname"));
					System.out.println(mdto.toString());
				}
			}
		}catch(Exception e ) { 
		}finally { 
			try {
				if(psmts!=null) {
					psmts.close();
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

