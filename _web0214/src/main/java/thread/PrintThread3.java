package thread;

public class PrintThread3 extends Thread {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("지원 정리");
		System.out.println("실행 종료");
	}

	
	
    
}