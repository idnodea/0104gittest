package sec03.exam02;


public abstract class Animal{
	
	public String kind;
	
//	public abstract void breathe() {  //오류-abstract 추상클래스는 몸통(실체가 있는)부분에 붙일 수 없음
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //추상메소드    추상메소드를 담을 수 있다.
	
	
}
