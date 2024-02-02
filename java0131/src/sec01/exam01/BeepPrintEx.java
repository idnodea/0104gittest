//스레드하나
package sec01.exam01;

public class BeepPrintEx {
//스레드하나
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			System.out.println("beep");
//			Thread.sleep(500); //잠시멈춤 0.5
			
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
		
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
	}

}
