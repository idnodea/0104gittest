package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//class MyAction implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("클릭!");
//		System.out.println(e.getSource()); //정보가져오는 코드
//	}
//	
//}

public class MyFrame3 extends JFrame{
	public MyFrame3() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); //컴포넌트
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");
		
		//버튼
		con.setLayout(new FlowLayout());
		JButton jb = new JButton("클릭");
		con.add(jb);	
		jb.addActionListener(new MyAction());
		
		//버튼2
//		con.setLayout(new FlowLayout());
		JButton jb2 = new JButton("클릭2");
		con.add(jb2);
		jb2.addActionListener(new MyAction());
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}
}
