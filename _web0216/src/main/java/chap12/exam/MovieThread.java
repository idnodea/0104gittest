package chap12.exam;

public class MovieThread extends Thread{
	
	//임플리먼트-런상속
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다");
			if(this.isInterrupted()) {
				break;
			}
		}
	}

		
}
