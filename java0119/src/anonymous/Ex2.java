package anonymous;

interface Inter{  
	void disp();
}

public class Ex2 {   
	public static void main(String[] args) {
		Inter it = new Inter() { //익명구현객체
			
			int y=100;
			public void disp2() {
				System.out.println("disp2");
			}
			@Override
			public void disp() {
				System.out.println(y);
				disp2();
			}
		};
		it.disp();
			
	}
}
