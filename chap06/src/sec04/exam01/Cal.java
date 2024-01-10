package sec04.exam01;

public class Cal {  //클래스는 대문자 시작
	public static int sx;
	int x;

	public void power() {   //static  x  public 빼도상관x
		System.out.println("전원을 켭니다");
		System.out.println("sx:"+sx);
	}
	
	void printX() {   //메서드나 필드는 소문자 시작
		System.out.println(x);
	}
}
