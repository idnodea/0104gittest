package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,id,pass);
		Statement stmt = conn.createStatement();
		String sql="update emp set sal = 5000 where empno = 7777";
		
//		수정하는식: update dept set dname = '총무', loc = '아이', where deptno = 50 //dept라서 컬럼이름들도 다름
		
//		stmt.executeUpdate(sql);
		int result = stmt.executeUpdate(sql);
		if (result==1){
			System.out.println("수정성공");
		}else {
			System.out.println("수정실패");
		}
	}

}
