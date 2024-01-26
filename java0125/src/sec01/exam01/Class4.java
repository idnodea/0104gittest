package sec01.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class4 {
	 void method() throws SQLException{  //static 붙여서 하면
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		Connection conn = DriverManager.getConnection(url, id, pass);//try with resources시작
		Statement stmt = conn.createStatement(); //새로운 트라이구문
		ResultSet rs = stmt.executeQuery(sql); 

	try (conn; stmt; rs)  //단 던지기 써야함
			//Connection conn = DriverManager.getConnection(url, id, pass);//try with resources시작
//			 Statement stmt = conn.createStatement();//변수명 앞에 추가
//			ResultSet rs = stmt.executeQuery(sql);   //소괄호+아래으 파이널리구문 삭제
			{
			
//			conn = DriverManager.getConnection(url, id, pass);
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);  여기를 주석처리해주고 위로 옮긴다
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.println(rs.getDouble("sal"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}// finally {
//			if (rs != null)
//				try {
//					rs.close();
//				} catch (Exception e) {
//				}
//			if (stmt != null)
//				try {
//					stmt.close();
//				} catch (Exception e) {
//				}
//			if (conn != null)
//				try {
//					conn.close();
//				} catch (Exception e) {
//				}
//		}
	}
	
	public static void main(String[]args) throws SQLException {
		 	Class4 cs = new Class4();
	        cs.method();
//		method(); //static으로 만들어서 하는거
	}
}