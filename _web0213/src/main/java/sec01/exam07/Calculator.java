package sec01.exam07;

public class Calculator {
	//객체공유
	private int memory;
	
	//세터
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
	
	

}