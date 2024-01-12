package sec04.exam05;

class MyClass{
	void method1() {         //힙영역 
		System.out.println(this.toString());
		System.out.println("method1");
	}
	static void method2() {   //
		System.out.println();
		System.out.println("method2");
	}
}

public class StaticClass {
	
	static void method3() {    //static 
		System.out.println("method3");   
	}
	
	public static void main(String[] arge) {   
		StaticClass.method3(); 
		MyClass.method2();   //원칙
		MyClass mc= new MyClass();
		mc.method1();	//객체 생성이 되야 실행되고 실행되고 사라짐
		mc.method2();	//static 이미 	    //원칙이 아님
		MyClass mc2= new MyClass();
		mc2.method1();		//객체생성이 필요
		mc2.method2();       //객체생성과 상관없이 메소드를 실행시킨다.
		
		
		//this는 참조다.  따라서 동적 static메소드에서는 쓸 수 없다.
	} 
}
