//스레드 둘
package sec01.exam01;

public class BeepPrintEx2 {
//스레드 둘
	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();    //beeptask클래스의 public void run()적는게 아님
						//
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
		
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		System.out.println("main 종료");
	}

}
