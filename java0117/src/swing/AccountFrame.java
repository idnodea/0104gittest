package swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AccountFrame extends JFrame {

	public AccountFrame() {
		Container cont = this.getContentPane();
		cont.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 몸통
		this.setTitle("스윙 연습");
		this.setLocation(200, 100); // y축,x축
		this.setSize(900, 500); // 크기설정 너비 높이 w h
		this.setVisible(true);

		// 이름라벨
		JLabel jla1 = new JLabel("이름");
		cont.add(jla1);
		jla1.setLocation(20, 50);
		jla1.setSize(100, 30);
		// 이름텍스트
		JTextField jb1 = new JTextField();
		cont.add(jb1);
		jb1.setLocation(50, 50);
		jb1.setSize(100, 30);

		// 아이디라벨
		JLabel jla2 = new JLabel("아이디");
		cont.add(jla2);
		jla2.setLocation(200, 50);
		jla2.setSize(100, 30);
		// 아이디텍스트
		JTextField jb2 = new JTextField();
		cont.add(jb2);
		jla2.setLocation(250, 50);
		jla2.setSize(100, 30);

		// 패스워드라벨
		JLabel jla3 = new JLabel("패스워드");
		cont.add(jla3);
		jla3.setLocation(400, 50);
		jla3.setSize(100, 30);
		// 생년월일텍스트
		JTextField jb3 = new JTextField();
		cont.add(jb3);
		jb3.setLocation(460, 50);
		jb3.setSize(100, 30);

		// 생년월일라벨
		JLabel jla4 = new JLabel("생년월일");
		cont.add(jla4);
		jla4.setLocation(620, 50);
		jla4.setSize(100, 30);
		// 생년월일텍스트
		JTextField jb4 = new JTextField();
		cont.add(jb4);
		jb4.setLocation(680, 50);
		jb4.setSize(100, 30);

		// 전화라벨
		JLabel jla5 = new JLabel("전화");
		cont.add(jla5);
		jla1.setLocation(20, 80);
		jla1.setSize(100, 30);
		// 전화텍스트
		JTextField jb5 = new JTextField();
		cont.add(jb5);
		jb1.setLocation(50, 80);
		jb1.setSize(100, 30);

		// 잔고라벨
		JLabel jla6 = new JLabel("잔고");
		cont.add(jla6);
		jla1.setLocation(200, 80);
		jla1.setSize(100, 30);
		// 잔고텍스트
		JTextField jb6 = new JTextField();
		cont.add(jb6);
		jb1.setLocation(250, 80);
		jb1.setSize(100, 30);

		// 전체내용라벨
		JLabel jla7 = new JLabel("전체내용");
		cont.add(jla7);
		jla1.setLocation(20, 350);
		jla1.setSize(100, 30);
//		// 전체내용버튼
//		JButton jb7 = new JButton("");
//		cont.add(jb7);
//		jb1.setLocation(60, 50);
//		jb1.setSize(40, 30);

		// 입력라벨
		JLabel jla8 = new JLabel("입력");
		cont.add(jla8);
		jla1.setLocation(200, 350);
		jla1.setSize(100, 30);
//		// 입력버튼
//		JButton jb8 = new JButton("");
//		cont.add(jb8);
//		jb1.setLocation(60, 50);
//		jb1.setSize(40, 30);

		// 조회라벨
		JLabel jla9 = new JLabel("조회");
		cont.add(jla9);
		jla1.setLocation(380, 350);
		jla1.setSize(100, 30);
//		// 조회버튼
//		JButton jb9 = new JButton("");
//		cont.add(jb9);
//		jb1.setLocation(60, 50);
//		jb1.setSize(40, 30);

		// 수정라벨
		JLabel jla10 = new JLabel("수정");
		cont.add(jla10);
		jla1.setLocation(560, 350);
		jla1.setSize(100, 30);
//		// 수정버튼
//		JButton jb10 = new JButton("");
//		cont.add(jb10);
//		jb1.setLocation(60, 50);
//		jb1.setSize(40, 30);

		// 삭제라벨
		JLabel jla11 = new JLabel("입력");
		cont.add(jla11);
		jla1.setLocation(740, 350);
		jla1.setSize(100, 30);
//		// 삭제버튼
//		JButton jb11 = new JButton("");
//		cont.add(jb11);
//		jb1.setLocation(60, 50);
//		jb1.setSize(40, 30);
		
		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		cont.add(ta);
		
	}

	public static void main(String[] args) {
		new AccountFrame();
	}

}
