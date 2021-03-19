package jdbc;

import java.sql.Statement;

import javax.net.ssl.SSLContext;

import org.omg.PortableServer.AdapterActivator;

import oracle.net.aso.e;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//JDBC : DB연동여부 테스트
public class JdbcTest01 {
	//field
	//constructor
	//method
	public static void main(String[] args) {
		JdbcTest01 jt = new JdbcTest01();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="scott";
		String password="tiger";	
		
		Connection conn = null; 
		Statement stmt = null;
//		참조변수.필드
//		참조변수.메소드();
	
//		1.JDBC 드라이버 로드
/*		JDBC 드라이버를 로드하기 위해 드라이버 클래스 파일을 로드한다. 다음과 같이 자바의
		Class 클래스의 forName() 메소드를 이용하면 특정 클래스 파일을 읽어 들일 수 있다.
		*/
//		MySql 이면 Class.forName("com.mysql.jdbc.Driver");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상적으로 JDBC 드라이버 로드하였어요");
		
		
//		2.자바 응용프로그램과 JDBC의 연결
		/*DriverManager는 자바 응용프로그램을 JDBC 드라이버에 연결시켜주는 클래스이다.
		아래 코드와 같이 DriverManager.getConnection() 메소드를 호출하여 데이터베이스
		에 연결하고 Connection 객체를 반환한다.
		
		Connection  java.sql.DriverManager  //"jdbc:oracle:thin:@localhost:1521:xe"
		getConnection(String url, String user, String password)
		*/
//			다중catch 절
		
			
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("Connection 얻기 성공");

		
//		3.실행할 객체를 생성 및 쿼리 실행
//		자바에서 SQL 문을 실행하기 위해서는 Statement 클래스

			//실행할 객체를 생성
			stmt = conn.createStatement();
			System.out.println("Statement객체 생성 성공");
			// 쿼리 실행
			// 쿼리문 주의사항, 문법,데이터타입, ;미포함,  공백
			//int executeUpdate(String sql) :INSERT, UPDATE, 또는 DELETE과 같은 sql문을 실행하고, 
//											sql문 실행으로 영향을 받은 행의 개수나 0을 반환
//			int cnt = stmt.executeUpdate("insert into dept values(90,'IT','서울')");
//			int cnt = stmt.executeUpdate("delete from dept where deptno=90");
			int cnt = stmt.executeUpdate("update dept set loc='독도' where deptno=90");
			
			
			if(cnt>0) {
				System.out.println("Query가 정상적으로 실행 cnt = "+cnt);
			}else {
				System.out.println("Query가 정상적으로 X cnt="+cnt);
			}
//			다중 catch절
		} catch (SQLException e) {
			System.out.println("SQL 관련 에러발생");
			e.printStackTrace();
			System.out.println();
		
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
			e.printStackTrace();
		}finally {
			//자원반납을 반드시 하게 하려면 finally 블럭안에 코드작성.
			System.out.println("finally블럭안");
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
		//try catch
		
	}//main

}//class



//다중 catch절 		주의. Exception 클래스라도 계층구조가 있기 때문에 하위부터 작성하고 상위로 올라가야한다. 
/* 					주의. 하위Exception 클래스부터 먼저 작성하고 상위Exception클래스를 뒤에 명시.
 *  try{
 *  
 *  	코드
 *  	위험코드
 *  	위험코드
 *  }catch(하위 Exception 클래스명 참조변수){
 *  예외발생 처리 코드
 *  }catch(상위 Exception 클래스명 참조변수){
 *  예외발생 처리 코드
 *  }finally{
 *  finally 블럭에는 catch 절에 들어가던 들어가지 않던  무조건 실행해야하는 코드를 작성한다.
 *  예) DB연동시의 자원반납.
 *  }
 */












