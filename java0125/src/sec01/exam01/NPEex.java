package sec01.exam01;

class MyClass{   //클래스만들고 메소드만들고,
	void method() {}
}

public class NPEex {
	public static void main(String[]args) {
//		MyClass mc = null; //객체생성x->주소x
//		System.out.println(mc);
//		mc.method();  //주소가 없다
		
		int x;
		String data = null;
//		String data = "aaa";
		System.out.println(data);   //오류x
		System.out.println(data.toString());  //오류
	}
}
