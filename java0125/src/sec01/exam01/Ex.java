package sec01.exam01;

class ThrowClass{
	void method(int x) throws Exception { //throws
		if(x>10) {
			throw new Exception("예외발생");
		} else {
			System.out.println(x);
		}
		
//		throw new Exception("예외 발생");  //throw  o
////		throw new Exception("예외 발생");  //throws  x
////		new Exception("예외 발생");
//		//throw라는 명령어
		
	}
}

public class Ex {

	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
//			tc.method();
			tc.method(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
