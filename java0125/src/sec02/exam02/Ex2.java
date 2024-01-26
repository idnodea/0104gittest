////예외 떠넘기기 0125 15:00
//
//package sec02.exam02;
//
//class AnyClass{
//	void anyMethod() throws Exception{}
//	void method() throws Exception {
//		this.anyMethod();  //
////		anyMethod();  //
//	}
//}
//
//
//
//public class Ex {
//
//	public static void main(String[] args) throws Exception{
//		AnyClass ac = new AnyClass();
////		ac.anyMethod();
////		ac.method();
//		
//		try {
//			
//		}catch() {
//			
//		}
//	}
//
//}
package sec02.exam02;

class AnyClass2 {
	void anyMethod() throws InterruptedException{  //이부분 계속 변경
//		throw new Exception();
//		throw new ClassNotFoundException();
		throw new InterruptedException();
		
	}
}

public class Ex2 {
	public static void main(String[] args) {
//		AnyClass ac = new AnyClass();
//		ac.anyMethod();
		AnyClass2 ac = new AnyClass2();
		try {
			ac.anyMethod();
		}catch(InterruptedException e){  //이부분도 늘 변경
			e.printStackTrace();
		}
		
	}
}
