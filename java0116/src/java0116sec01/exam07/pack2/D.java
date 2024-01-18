package java0116sec01.exam07.pack2;

import java0116sec01.exam07.pack1.A;

public class D extends A {


	public D() {
//		A a = new A();
//		a.field = "value";
//		a.method();
		super();  //부모의 생성자 A()
		this.field = "value";	  //this로도 호출가능
		this.method();			
		super.field = "value";    //super로도 호출가능
		super.method();
		
		//필드들이 프로텍티드여도 클래스가 퍼블릭이므로 쓸 수 있음
	}
	public void method() {
		
		this.field = "value";
		this.method();
	}



}
