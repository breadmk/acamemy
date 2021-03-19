package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//db연동 - select 쿼리문 실행.
public class SelectTest05 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //쿼리 실행결과를 저장할 변수선언.
		String sql = null;  //실행할 쿼리문을 저장할 변수 선언.
		
//		1)JDBC 드라이버 로드.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상적으로 JDBC 드라이버 로드하였어요");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
//		2)자바 응용프로그램과 JDBC의 연결
		try {
			//까먹지 말고 Connection 클래스의 객체를 만들어주어야한다.
			conn = DriverManager.getConnection(url,user,password); 
		
//			3-1)쿼리실행할 객체를 생성
			stmt = conn.createStatement();
			
//			3-2)쿼리실행
//			 쿼리문 주의사항, 문법,데이터타입, ;미포함,  공백
//			sum=sum+1;
//			sum+=1
//			sql  = "select deptno,dname,loc ";
//			sql += " from dept ";
//			sql += " where deptno=90";
			
			sql = "select deptno,dname,loc "
				+ " from dept where deptno=90";
//			위에 나눠서 3줄로 쓰는거보다 sql + 로 하나로 이어주는게 훨씬 메모리소모가 적다.
//			대신 공백을 주의해라
			rs = stmt.executeQuery(sql);
			
			//콘솔출력
			while(rs.next()) {
				//rs.getXxx(String타입의 컬럼명)
				/*
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
				*/
				
				//Xxx getXxx(int columnIndex) : select 문의 컬럼순서를 제시
				int deptno = rs.getInt(1);	//여기에서는 select 문의 첫번째 컬럼인 deptno
				String dname = rs.getString(2);	//여기에서는 select 문의 두번째 컬럼인 dname
				String loc = rs.getString(3);	//여기에서는 select 문의 세번째 컬럼인 loc
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}	//select 문에서 컬럼명의 순서가 달라지기 때문에 (n)보다 위의 컬럼명 명시가 훨씬 사용하기 좋다.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
//			4)자원반납(finally) - 나중에 사용한 객체부터 close 한다.
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				if(conn!=null) { try { conn.close(); } 
				catch (SQLException e) {
					e.printStackTrace();
				}
				}//end of if
				
				
		}//end of finally
		
	}//end of main

}//end of class
