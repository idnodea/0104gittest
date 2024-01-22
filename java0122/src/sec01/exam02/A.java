package sec01.exam02;

public class A {
	int x;
	static int y;
	static C x1;
	C x2;
//	static int y;
	
	B field1 = new B();
	C field2 = new C();
	
//	static B field33;  //문법오류가 아닌데
//	static B field3 = new B();   //문법오류가 되는건, 선언하고 선언오류o
	//A가 객체생성이 되어야	 B도 객체생성이 된다.
	static B field3 = new A().new B();  //강제로 변환o  A를 선언안해도 되는걸. B를 선언하기 위해 강제로 A까지 선언
	
	static C field4 = new C();   //스태틱필드의 경우, 스태틱은 스태틱만 가능하다
	
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
		B var1 = new A().new B();
	}
	
	
	class B{}  //인스턴스멤버클래스
	static class C{} //스태틱멤버클래스
}
