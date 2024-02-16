package sec01.verrify;

public class ThreadEx {

	public static void main(String[] args) {
		Thread mth = Thread.currentThread();
		System.out.println(mth.getName());
		
		Thread th1 = new MovieThread();
		System.out.println(th1.getName()+"***");
		th1.start();
		
		Runnable ra = new MusicRunnable();
		Thread th2 = new Thread(ra);
		th2.setName("Music");
		System.out.println(th2.getName()+"***");
		th2.start();
	}

}
