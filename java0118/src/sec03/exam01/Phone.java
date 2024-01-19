//0118 1교시
package sec03.exam01;

public abstract class Phone {  
	int x; //변수x 필드o
	
	
	public Phone(int x) {     //추상메서드를 가진다
		super();
		this.x = x;
	}
//	public abstract void ring();     //일반클래스에는 추상클래스를 만들 수 없다
	
	public abstract String ring(int tel);   //추상메소드가 꼭 있어야하는건 아니다.의미는없어지겠지만
									//추상메소드는 .dl dksls ;로 끝난다
}
