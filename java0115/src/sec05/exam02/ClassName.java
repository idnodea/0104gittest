package sec05.exam02;

public class ClassName {
	int field1;
	void method1() {}
	
	static int field2; //사용가능(접근가능)
	static void method2() {}
	static void method3() {  //메모리에, 실행가능하게?
//		field1 = 10;  //즉시 사용 불가능(객체생성 후 사용가능)
		field2 = 10;  //사용 가능
		
		ClassName cn = new ClassName(); //field1을 사용가능하게끔.  객체생성 후 사용가능
		cn.field1 = 10;					
		ClassName.field2 = 10;
		System.out.println(cn.field1);
		System.out.println(ClassName.field2);
	}
//		
	void method4() {   //메모리에, 실행가능하게
		field1 =10;
		field2 =10;
		
		this.field1 =10;
		ClassName.field2 =10;
		
	}
}
