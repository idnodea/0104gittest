package thread;

public class SleepEx {

	//싱글스레드
	public static void main(String[] args) {
		for (int i = 0; i <3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
