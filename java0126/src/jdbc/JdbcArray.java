package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcArray {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/firm";
        String id = "root";
        String pass = "mysql";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, id, pass);
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM emp";

        ResultSet rs = stmt.executeQuery(sql);

        List<Employee> employeeList = new ArrayList<>();

        while (rs.next()) {
            int empno = rs.getInt("empno");
            String ename = rs.getString("ename");
            double sal = rs.getDouble("sal");

            Employee employee = new Employee(empno, ename, sal);
            employeeList.add(employee);
        }

        // 이제 'employeeList'에 ResultSet의 모든 행이 포함되어 있습니다.
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // 각 행의 데이터를 나타내는 Employee 클래스
    static class Employee {
        int empno;
        String ename;
        double sal;

        public Employee(int empno, String ename, double sal) {
            this.empno = empno;
            this.ename = ename;
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "empno=" + empno +
                    ", ename='" + ename + '\'' +
                    ", sal=" + sal +
                    '}';
        }
    }//Class.forName("org.mariadb.jdbc.Driver");
}
