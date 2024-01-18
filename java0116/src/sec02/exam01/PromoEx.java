package sec02.exam01;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromoEx {

	public static void main(String[] args) {
		Object obj  = new A(); //업캐스팅
		Object obj2 = new E();
		B b = new B();
//		A b = new B();   x
		C c = new C();
		D d = new D();
		E e = new E();
		
//		int y =100;
//		double x = y;
		A a1 = b;    
		A a9 = new B();	  
		A a8 = new C();	  
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		B b2 = new D();
		C c1 = e;	  //부모로 변수선언,자식으로 객체생성
		
		
//		B b3 = e;     //상속관계가 아니므로 컴파일에러
//		C c2 = d;     //상속관계가 아니므로 컴파일에러
		
	}

}
