package page408_1;

public class A {
	static int field2; //static 필드 //이건 되지만,
	class B{
		
		B(){}  //클래스 B의 생성자
		int field1;   //변수x  핃드o  
					//매개변수x 지역변수x
//		static int field2;   //이건 오류  -왜일까   객체생성이 안된채로는 접근불가
		void method1() {}		// 이 메소드는 허용
//		static void method2() {}    //이 메소드는 허용하지 않음
	}
	void methodA() {
//		B b;
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
}
