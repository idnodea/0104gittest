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

class AnyClass {
	void anyMethod() throws Exception {}
	void method() {
		try {
			anyMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Ex {
	public static void main(String[] args) {
		AnyClass ac = new AnyClass();
		ac.method();
	}
}
