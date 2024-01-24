//package page413;
//
//public class A {
//	static int field1;
//	static void method1() {}
//	
//	class B{
//		void method() {
//			field1 = 10;
//			method1();
//			
//		}
//	}
//}     가능한 코드
package page413;

public class A {
	public static void main(String[] args) {
//		B b = new B(); //2단계이후 실행
		B b = new B(); //2단계이후 실행
		b.method(); //2단계이후 실행
		
		
		
		System.out.println("실행");
//		B b = new B(); //오류  public static void main(String[] args)
//		B b = new B(); //오류삭제 위에서 static빠진다면 가능
		
//		A a = new A();  //그렇다면, 위의 A를 객체화시켜준다면
////		B b = new A().new B();   //이런 문법도 가능해진다
//		B b = a.new B();   //이런 문법도 가능해진다
//		b.method();    //2단계 classB에 static붙인이후 잠깐 주석처리
		
	}
	
	
	int field1;

	void method1() {
		System.out.println("method1()");
	}

	static class B {   //2단계 여기에 static 붙여보면? 단독생성
		void method() {
//			field1 = 10;
//			method1();
//			System.out.println("method(),"+field1);
			System.out.println("method(),");
		}
	}

	
}
