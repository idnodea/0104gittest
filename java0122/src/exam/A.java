package exam;

public class A {
	class B{} //A객체를 생성해야만 사용할 수 있는 B클래스
	static class B1{} //A클래스로 바로 접근할 수 있는 B1클래스
	
	void method() { //method()가 실행될 때만 사용할 수 있는 B2클래스
		class B2{}
	}
}

