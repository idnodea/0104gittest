package sec01;

class YourClass2{
	
}


public class Passing4 {

	public static void main(String[] args) {
		YourClass2 yc = new YourClass2();  //객체 생성(기본생성자 실행)
		System.out.println("main:"+yc);
		method1(yc);
		YourClass2 yc1 = new YourClass2(); //객체 생성(기본생성자 실행)
//		System.out.println(yc1);
		System.out.println("다른객체:"+yc1);
	}
	
	public static void method1(YourClass2 yc) {
		System.out.println("method1:"+yc);
		return;
	}
	
}
//참조타입을 지역변수로 써도, 힙영역의 메모리가 공유됨