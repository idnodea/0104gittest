package sec03.exam01;

import java.io.IOException;

public class PrintfExample {
	public static void main(String [] args) throws IOException {
		int keycode;
		
		for(;;) {
			System.out.print("입력>");
			keycode = System.in.read();
			System.out.println(keycode);
			
			if(keycode == 113) { //q입력
				break;
			}
		}
		
	}
}
