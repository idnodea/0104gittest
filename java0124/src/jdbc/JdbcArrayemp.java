package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Field{
	private int empno;
	private int mgr;
	private int sal;
	private int deptno;
	private String ename;
	private String job;
	private String hiredate;
	private double comm;

	
	public Field(int empno, int mgr, int sal, int deptno, String ename, String job, String hiredate, double comm) {
		super();
		this.empno = empno;
		this.mgr = mgr;
		this.sal = sal;
		this.deptno = deptno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.comm = comm;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	
	
	
}

public class JdbcArrayemp {
	
	public static void main(String[]args) {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "SELECT empno,ename,job,mgr,hiredate, sal,comm, deptno FROM firm.emp";
		Connection conn = null;		
		Statement stmt = null;
//		ResultSet rs = stmt.executeQuery(sql);오류
		
		List <Field> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				int mgr = rs.getInt("mgr");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String hiredate = rs.getString("hiredate");
				double comm = rs.getDouble("comm");
				
				Field field = new Field(empno, mgr, sal, deptno, ename, job, hiredate, comm);
				list.add(field);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Field field : list) {
            System.out.println(field.getDeptno() + "\t" + field.getEname() + "\t" + field.getJob() + "\t" +
                    field.getHiredate() + "\t" + field.getComm() + "\t" + field.getSal() + "\t" + field.getMgr());
        }
		
	}
	
	
}
