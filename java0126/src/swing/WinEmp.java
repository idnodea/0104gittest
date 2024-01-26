package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmp extends JFrame {
//	JLabel lb1 = new JLabel("부서코드:");
	JTextField tf1 = new JTextField(5);
//	JLabel lb2 = new JLabel("부서명:");
	JTextField tf2 = new JTextField(5);
//	JLabel lb3 = new JLabel("부서위치:");
	JTextField tf3 = new JTextField(5);
	
	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("조회");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(10, 40);
	
	Connection conn;  //트라이캐치 이후 이 부분 분리
	Statement stmt;	  //트라이캐치 이후 이 부분 분리
	public WinEmp()  {
		//
		// MySQL 연결 정보 설정
				String url = "jdbc:mysql://localhost:3306/firm";
				String id = "root";
				String pass = "mysql";

				// 복사붙여넣은 이후, try캐치구문 만든 뒤, 몰아넣기
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url, id, pass);
					stmt = conn.createStatement();
					
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				

				// "emp" 테이블에서 모든 데이터를 조회하는 SQL 실행
//				ResultSet rs = stmt.executeQuery("select * from emp");
		
		
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		
		//라벨을 지역변수로
		JLabel lb1 = new JLabel("부서코드:");
		JLabel lb2 = new JLabel("부서명:");
		JLabel lb3 = new JLabel("부서위치:");
		
		//버튼
		con.setLayout(new BorderLayout()); //플로우에서보더로 변경
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		con.add(jp1,BorderLayout.SOUTH);
		
		//스크롤바
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);
		
		//윗라벨
		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3,BorderLayout.NORTH);
		jp3.add(lb1);jp3.add(tf1);
		jp3.add(lb2);jp3.add(tf2);
		jp3.add(lb3);jp3.add(tf3);
		this.setTitle("DEPT 관리");
		
//		con.add(bt1, BorderLayout.EAST);
//		con.add(bt2, BorderLayout.WEST);
//		con.add(bt3, BorderLayout.SOUTH);
//		con.add(bt4, BorderLayout.NORTH);
//		con.add(bt5, BorderLayout.CENTER);
		
		this.setLocation(500, 400);
		this.setSize(500, 300);
		this.setVisible(true);
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select();
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insert();
				clearTextField();
				select();
			}
		});
	}
	
	private void clearTextField() {
		tf1.setText(""); tf2.setText(""); tf3.setText("");
	}
	
	public void select() {
		String sql = "select deptno,dname,loc from dept";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			ta.setText("");
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				String str = String.format("%d, %s, %s\n",
						deptno, dname, loc);
				ta.append(str);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public void insert() {
		String sql = String.format(
				"insert into dept values(%s, '%s', '%s')",
				tf1.getText(),tf2.getText(), tf3.getText());
		try {
			int res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new WinEmp();
	}
}