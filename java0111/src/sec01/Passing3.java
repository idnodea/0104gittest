package sec01;

class YourClass{
	
}


public class Passing3 {

	public static void main(String[] args) {
		YourClass yc = new YourClass();  //객체 생성(기본생성자 실행)
		System.out.println(yc);
	}
	
	public static void method1(YourClass yc) {
		System.out.println(yc);
		return;
	}
	
}
