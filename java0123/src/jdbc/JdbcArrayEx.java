package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcArrayEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// MySQL 연결 정보 설정
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		// JDBC 드라이버 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 데이터베이스에 연결
		Connection conn = DriverManager.getConnection(url, id, pass);
		System.out.println("접속 성공");

		// SQL 문을 실행하기 위한 Statement 생성
		Statement stmt = conn.createStatement();

		// "emp" 테이블에서 모든 데이터를 조회하는 SQL 실행
		ResultSet rs = stmt.executeQuery("select * from emp");

		// 조회된 데이터 출력
		while (rs.next()) {
			System.out.print(rs.getInt("empno") + "\t"); // "empno" 컬럼 출력
			System.out.print(rs.getString("ename") + "\t"); // "ename" 컬럼 출력
			System.out.println(rs.getDouble("sal")); // "sal" 컬럼 출력
		}

		// 리소스 정리 (순서 중요: 역순으로 닫는다)
		rs.close();
		stmt.close();
		conn.close();
	}
}
