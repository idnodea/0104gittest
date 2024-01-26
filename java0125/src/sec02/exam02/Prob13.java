package sec02.exam02;

public class Prob13 {
	void method() throws Exception{
		System.out.println("method()");
	}
	void method2() {
		try {
//			method();
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("method2()-finally");
		}
	}
	
	public static void main(String[]args) {
		Prob13 pr  = new Prob13();
		pr.method2();
	}
}
