package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  //import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//문제점 dname컬럼만 사용하고 싶다? 해결하기 위해서.
class Dept{
	private int deptno;
	private String dname;
	private String loc;
	
	
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}

public class JdbcArrayEx {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<Dept> list = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Statement stmt = null; //import java.sql.Statement;
		Connection conn =null;
		String sql = "select  deptno ,dname, loc from dept";//데이터베이스이름을 위에 써서, 생략가능
//		String sql = "select * from dept";//데이터베이스이름을 위에 써서, 생략가능
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pass);
			stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()) {
//		    	int deptno = rs.getInt(1);//칼룸 //위에 select 뒤 순서를 바꾸면 오류o
		    	int deptno = rs.getInt("deptno"); //위에 select 뒤 순서를 바꿔도 오류x
		    	String dname = rs.getString("dname");
		    	String loc = rs.getString("loc");
		    	String str = deptno+","+dname+","+loc;
		    	Dept dept = new Dept(deptno, dname, loc);  	
//				list.add(str);
				list.add(dept);
				
//		    	System.out.println(deptno+","+dname+","+loc);
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//확인차 출력
//		System.out.println(list);
//		for(Dept dept : list) {
//			System.out.println(dept);  //이 라인은 삭제하고 각 컬럼별로 출력해보세요
//		}
		
		//list에 있는 자료를 모두 출력하세요.
//		for(Dept dept : list) {
//			System.out.println(dept);  //이 라인은 삭제하고 각 컬럼별로 출력해보세요
//		}
		//문제점 dname컬럼만 사용하고 싶다?
		
		
		//각 컬럼별
		for(Dept dept : list) {			
			System.out.println(dept.getDeptno()+"\t"+dept.getDname()+"\t"+dept.getLoc());  //이 라인은 삭제하고 각 컬럼별로 출력해보세요
		}
		
		
//		stmt=conn.createStatement();
	
	}
}
