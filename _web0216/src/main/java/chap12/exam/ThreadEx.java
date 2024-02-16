package chap12.exam;

public class ThreadEx {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try { Thread.sleep(1000);} catch(InterruptedException e) {}
			
			thread.interrupt();
		}

}
