package KangMinGyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Company_Jdbc_Ex {

	public static void main(String[] args) {
			
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
//			1)드라이버 로딩
			Class.forName(driver);
			System.out.println("드라이버로딩 완료");
//			2)Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connection 객체 얻기 성공");
//			3)실행객체-PreparedStatement객체
			String sql = " select cno,cname,ceo,tel,dam from company ";
//			3-1)쿼리 실행 객체
			ps = conn.prepareStatement(sql);
//			3-2)쿼리문 실행
			rs = ps.executeQuery();
			
			if(rs!=null) {
				while(rs.next()){
					CompanyDTO cD = new CompanyDTO();
					cD.setcNo(rs.getInt("cno"));
					cD.setcName(rs.getString("cname"));
					cD.setCeo(rs.getString("ceo"));
					cD.setTel(rs.getString("tel"));
					cD.setDam(rs.getString("dam"));
					System.out.println(cD.toString());
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally { 
			try {
				if(ps!=null) {
					ps.close();
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
