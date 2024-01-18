package chap7.prob3;

public class Ex {
	//list.add(new Student("DDD");
	
	public static void method(B b) {
		
	}
	
	public static void main(String[] args) {
		method(new B());   //객체생성하면서 매개변수로 넘기기가 가능한가?
		
		B b1 = new B();		//1번
		B b3 = new D();		//3번
		B b4 = new E();		//4번
		
		
//		B b5 = (B) new A();		//5번   -오류
		B b11 = new B();
		B b12 = (B) new A();   //p355확인문제 3번-오류
		B b13 = new D();
		B b14 = new E();
		
		
		A a = new A();
		if (a instanceof B) {
			B b = (B) a;
			System.out.println("변환 가능");
		}else {
			System.out.println("변환 불가능");
		}
		
		B b = (B) a;
		
		
		
		
	}

}
