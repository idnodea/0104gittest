package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/company";
		String id = "root";
		String pass= "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mySQL 드라이버로딩");
		Connection conn = DriverManager.getConnection(url,id,pass);
		System.out.println("mySQL 접속성공");
		Statement sm = conn.createStatement();
		ResultSet rs= sm.executeQuery("select * from emp");
		while(rs.next()) {
			String ename = rs.getString("ename");
			int sal = rs.getInt("sal");
			System.out.printf("%s, %d",ename, sal);
		}
	}
	
}
