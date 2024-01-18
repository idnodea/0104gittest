package sec05.exam02;

public class Singleton {
	//PRIVATE 접근제한은 자신 클래스 내에서만 접근가능

	private static Singleton singleton = new Singleton();
	//객체 생성
	
	private Singleton() {
	//생성자를 PRIVATE로 하면?
	}
	
	public static Singleton getInstance(){ //사용법은 오직 이 메소드만 호출
		return singleton;
	}

}
