package thread;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		
		
			try {
				while(true) {
					System.out.println("실행 중, 실은 중단");
					Thread.sleep(1);	
				}
				
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println("지원정리");
				System.out.println("실행종료");
			}
		
//		System.out.println("지원정리");
//		System.out.println("실행종료");
	}
	
    
}