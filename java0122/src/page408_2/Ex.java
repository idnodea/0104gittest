package page408_2;

public class Ex {
	public static void main(String [] args) {
		A.C.field2 = 3;		//스태틱 붙은
		A.C.method2();      //스태틱 붙은
		
		A.C c = new A.C();  //스태틱 안 붙은
		c.field1 = 3;
		c.method1();
	}
}
