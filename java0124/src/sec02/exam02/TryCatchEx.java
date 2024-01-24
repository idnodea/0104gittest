//0124 1교시 예외처리
package sec02.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {
//	java.lang.String str;
	
	
//	Class.forName("java.lang.String");
	
//	try {
//		
//	}catch() {
//		
//	}
	
	
	//try-catch는 코드블럭이다
	//try-catch로 처리
	public static void main(String[]args) {
//	java.lang.String str;
		String str;
		
		try {
			Class.forName(("com.mysql.cj.jdbc.Driver"));
		} catch (ClassNotFoundException e1) {
			//예외처리코드
			System.out.println("클래스가 존재하지 않음");
			System.exit(0);
			e1.printStackTrace();
		} finally {
			System.out.println("반드시 실행");
		}
		//
//		Connection conn = DriverManager.getConnection(null);
		try {
			Connection conn = DriverManager.getConnection(null);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	//throws처리
//	
//	public static void main(String[]args) throws ClassNotFoundException {
//		String str;
//		Class.forName("ffff");
//		
//	}
	
}
