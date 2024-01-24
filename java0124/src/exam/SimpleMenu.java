package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SimpleMenu {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "mysql";
    private static Scanner scanner = new Scanner(System.in);
    private static Statement stmt = null;
    private static Connection conn = null;

    private int deptno;
    private String dname;
    private String loc;

    public SimpleMenu(int deptno, String dname, String loc) {
        super();
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = conn.createStatement();

            boolean exit = false;

            while (!exit) {
                System.out.println("1. 데이터 보기");
                System.out.println("2. 데이터 삽입");
                System.out.println("3. 종료");
                System.out.print("선택하세요: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        viewData();
                        break;
                    case "2":
                        insertData();
                        break;
                    case "3":
                        exit = true;
                        break;
                    default:
                        System.out.println("유효하지 않은 선택. 다시 시도하세요.");
                        break;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // 예외가 발생하면 여기에서 리소스를 안전하게 닫습니다.
            closeResources();
        } finally {
            // 마지막으로 리소스를 닫습니다.
            closeResources();
        }
    }

    private static void viewData() {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from dept");

            // 조회된 데이터 출력
            while (rs.next()) {
                System.out.print(rs.getInt("deptno") + "\t");
                System.out.print(rs.getString("dname") + "\t");
                System.out.println(rs.getString("loc"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertData() {
        try {
            // 스캐너
            Scanner scanner = new Scanner(System.in);

            System.out.print("부서 번호 입력: ");
            int deptno = scanner.nextInt();
            scanner.nextLine(); // Enter 처리

            System.out.print("부서 이름 입력: ");
            String dname = scanner.nextLine();

            System.out.print("부서 위치 입력: ");
            String loc = scanner.nextLine();

            // 데이터 삽입 로직 작성
            String sql = "insert into dept(deptno, dname, loc) values (" + deptno + ", '" + dname + "', '" + loc + "')";
            try {
                int result = stmt.executeUpdate(sql);

                if (result > 0) {
                    System.out.println("데이터가 성공적으로 삽입되었습니다.");
                } else {
                    System.out.println("데이터 삽입에 실패했습니다.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } finally {
        	
		}
    }

    private static void closeResources() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}