package sec01.exam01;

class MyClass3{
	void method() {
//		throw new RuntimeException("나의 실행 예외");
		throw new MyException2("나의 실행 예외");
		
		
	}
}

public class ExceptionEx2 {
	public static void main(String[]args) {
		MyClass3 mc = new MyClass3();
		try {
			mc.method();
		}catch(MyException2 e) {
//			e.printStackTrace();
			System.out.println("내가 만든 실행예외");
		} //강제성없는 예외처리
		mc.method(); //강제성없는 예외처리
	}
}
