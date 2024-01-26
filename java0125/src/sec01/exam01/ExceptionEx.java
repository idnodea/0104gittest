package sec01.exam01;

class MyClass2{
	void method() throws MyException {
		//...
		throw new MyException("나의 예외상황");
	}
}

public class ExceptionEx {
	public static void main(String[]args) {
		MyClass2 mc = new MyClass2();
//		mc.method(); //강제성을 띄어야함
		try {
			mc.method();	
		}catch(MyException e) {
			e.printStackTrace();
		}
	}
}

