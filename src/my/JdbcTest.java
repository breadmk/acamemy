package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
//			1)드라이버 로딩
			Class.forName(driver);
			System.out.println("JDBC 드라이버 로드 완료");
//			2)Connection 객체 얻기
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 객체 얻기 성공");
//			3)실행 객체 생성  PreparedStatement객체,Statement객체
			String sql= "select dong,ho,owner,hp,car from samik ";
			psmt =conn.prepareStatement(sql);
//			3-2)쿼리문 실행
//			executeUpdate(): insert,update,delete
//							executeUpdate()의 리턴형태는 int
//							executeQuery() : select
//							executeQuery()의 리턴형태는 ResultSet
			rs = psmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					SamikDTO sDTO = new SamikDTO();
					sDTO.setDong(rs.getInt("dong"));
					sDTO.setHo(rs.getInt("ho"));
					sDTO.setOwner(rs.getString("owner"));
					sDTO.setHp(rs.getString("hp"));
					sDTO.setCar(rs.getString("car"));
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

