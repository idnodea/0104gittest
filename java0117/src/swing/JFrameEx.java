package swing;

import javax.swing.JFrame;

public class JFrameEx {
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//x눌러서 끄는 게 아니라, 콘솔창에서 붉은 버튼으로 중지하는데, 이걸 x버튼으로도 가능하게끔
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setSize(300,300);
		jf.setVisible(true);
	}
	
}
