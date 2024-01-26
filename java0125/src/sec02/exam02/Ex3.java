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


class AnyClass3 {
	void anyMethod() { 

		throw new NullPointerException();
		
	}
}

public class Ex3 {
	public static void main(String[] args) {
		AnyClass3 ac = new AnyClass3();
//		ac.anyMethod();
//		try {
			ac.anyMethod();
//		}catch(NullPointerException e) {
			
//		}
		System.out.println("실행중");
		
	}
}
