package dap;

import java.sql.*;
public class CRUD01 {

	public static void main(String[] args) {
//	필요한 변수 선언.
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger"; 
		PreparedStatement ps = null;
		ResultSet rs = null;
//	1.드라이버로딩
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 완료.");
//	2.Connection 객체생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 객체 생성 완료");
//	3.쿼리객체 생성
//	4.쿼리문(CRUD)
			String sql = "select sno,loc,hp,grade from school";
			ps = conn.prepareStatement(sql);
//			executeUpdate(): insert,update,delete
//							executeUpdate()의 리턴형태는 int
//							executeQuery() : select
//							executeQuery()의 리턴형태는 ResultSet
			rs = ps.executeQuery();	// 현재 SCHOOL 테이블 내용 확인.
			if(rs!=null) {
				while(rs.next()) {
					SchoolDTO sc = new SchoolDTO();
					sc.setSno(rs.getInt("sno"));
					sc.setLoc(rs.getString("loc"));
					sc.setHp(rs.getString("hp"));
					sc.setGrade(rs.getString("grade"));
					System.out.println(sc.toString());
				}
			}

			//comment : 쿼리문선언 -> 쿼리실행 -> 결과출력하는 순으로 작성하셨구뇽
			//comment : 릭팩토링 차원에서  아래 각 CRUD에 해당하는 부분을 메소드로 바꾸어 보세요~
			String sql1 = "delete from school where sno=3";	// sno=3  삭제.
			ps = conn.prepareStatement(sql1);
			int cnt1 = ps.executeUpdate();
			if(cnt1>0) System.out.println("삭제되었습니다.");
			

			//comment : update용 메서드로 바꾸어서 작성해보세요
			String sql2 = "update school set loc='마포구',grade='A' where sno=4"; //sno=4번에서 loc와 grade 변경.
			ps = conn.prepareStatement(sql2);
			int cnt2 = ps.executeUpdate();
			if(cnt2>0) System.out.println("변경되었습니다.");
			

			//comment : insert용 메서드로 바꾸어서 작성해보세요
			String sql3 = "insert into school values(5,'금천구','01034563456','C+')";	//sno=5 새로운 데이터 삽입.
			ps = conn.prepareStatement(sql3);
			int cnt3 = ps.executeUpdate();
			if(cnt3>0) System.out.println("등록되었습니다.");
			

			//comment : select용 메서드로 바꾸어서 작성해보세요
			String sql4 = "select sno,loc,hp,grade from school";	//sno=3 삭제와 sno=4번의 변경내용 sno=5 새로운 추가 데이터 확인.
			ps = conn.prepareStatement(sql4);
			rs = ps.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					SchoolDTO sc = new SchoolDTO();
					sc.setSno(rs.getInt("sno"));
					sc.setLoc(rs.getString("loc"));
					sc.setHp(rs.getString("hp"));
					sc.setGrade(rs.getString("grade"));
					System.out.println(sc.toString());
				}
				// 기본키 제약으로 insert구문때문에 실행은 1번 밖에 되지 않음.
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