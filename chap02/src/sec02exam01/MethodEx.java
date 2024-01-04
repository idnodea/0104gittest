package sec02exam01;

public class MethodEx {
	
	public static void method(int x, int y) {  //method 는 대문자x   클래스가 아니니까
		
		//System.out.println("메소드(함수)method()");  //메소드정의
		System.out.println(x+y);
		
		
	}
	
	public static int method2(int x, int y) {  //method 는 대문자x   클래스가 아니니까
		
//		return 100;
		return x+y;
		
		
	}
	
	
	public static void main(String[] args) {  //static은 객체지향이 아님
		//method(); //메소드호출
		method(100, 200); //호출
		
		int ret = method2(300, 400);
		//int ret = method2();
		System.out.println(ret);
	}


	
	}
	

