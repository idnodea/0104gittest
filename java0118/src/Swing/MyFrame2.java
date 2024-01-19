package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame2 extends JFrame implements ActionListener{
	JButton jb = new JButton("클릭");
	JButton jb2 = new JButton("클릭2");
	
	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); //컴포넌트
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");
		
		//버튼
		con.setLayout(new FlowLayout());
//		JButton jb = new JButton("클릭");
		con.add(jb);	
//		jb.addActionListener(new MyAction());
		jb.addActionListener(this);//여기서의 this 나 자신
		
		//버튼2	
//		con.setLayout(new FlowLayout());
		con.add(jb2);
		jb2.addActionListener(this);
	}
	
	//
	public static void main(String[] args) {
		new MyFrame2();  //여기서의 this의미
	}
	
	//새로 생성
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getSource()==jb);
		if(e.getSource() ==jb) {
			System.out.println("버튼");
		} else if(e.getSource()==jb2) {
			System.out.println("버튼2");
		}
	}
}
