//Swing1
package Swing.ver2;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame{
	JLabel lb1 = new JLabel("이름1:");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	
	JLabel lb2 = new JLabel("이름2:");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("버튼2");
	
	
	
	public MyWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		
		this.setTitle("자바스윙");
		this.setSize(400,300);
		this.setLocation(700,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}
}
