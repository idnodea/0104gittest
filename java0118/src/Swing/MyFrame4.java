package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class MyFrame4 extends JFrame implements ActionListener,MouseListener{
	JButton jb = new JButton("클릭");
	JButton jb2 = new JButton("클릭2");
	
	public MyFrame4() {
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
		//마우스리스너추가
		con.addMouseListener(this);
		
		
		//버튼2	
//		con.setLayout(new FlowLayout());
		con.add(jb2);
		jb2.addActionListener(this);
	}
	
	//
	public static void main(String[] args) {
		new MyFrame4();  //여기서의 this의미
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

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX()+","+e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
