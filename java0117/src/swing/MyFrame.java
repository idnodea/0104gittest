package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;   //자바프레임워크x  윈도우프로그램의 틀
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{

	public MyFrame() {   //이미 j프레임에서 상속받아 사용중이므로 아래의 코드 덩어리는, 덩어리간 순서가 상관없음
		//권고사항 컨텐트레이너    //애네는 순서상관있음.
		Container con = this.getContentPane();
		con.setLayout(null);
		///////
		
		JButton jb1 = new JButton("버튼");
		jb1.setLocation(100, 150);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		JLabel jb2 = new JLabel("라벨");
		con.add(jb2);
		jb2.setLocation(20, 220);
		jb2.setSize(100, 30);
		
		JTextField jb3 = new JTextField("입력");
		con.add(jb3);
		jb3.setLocation(20, 20);
		jb3.setSize(100, 30);
		
		
		this.setLocation(100,100);   //y축,x축
		this.setTitle("스윙 연습");
		this.setSize(300, 300);  //크기설정  너비 높이  w h
		this.setVisible(true); // 윈도우 프레임을 보이게  -메모리에 있지만, 보이지 않으니까
		
		
		//x눌러서 끄는 게 아니라, 콘솔창에서 붉은 버튼으로 중지
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //고정형 위의 명령을 x버튼으로 가능하게끔   
		
			
	}
	
	public static void main(String... ar) {
			new MyFrame();
	}
	
	
}
