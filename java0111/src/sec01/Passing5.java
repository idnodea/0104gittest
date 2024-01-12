package sec01;

class YourClass3{
	int x;
}


public class Passing5 {

	public static void main(String[] args) {
//		YourClass3 yc3 = null;   //
//		yc3.x =200;      //   실제 생성 x 런타임오류
		
		
		
		
		YourClass3 yc = new YourClass3();  //객체 생성(기본생성자 실행)
//		System.out.println("main:"+yc);
		
		System.out.println("이전 값:"+yc.x);
		method1(yc);
		System.out.println("콜 바이 레퍼런스:"+yc.x);//변수가 바뀌어서 된 건 아님
		
		
//		YourClass3 yc1 = new YourClass3(); //객체 생성(기본생성자 실행)
//		System.out.println(yc1);
//		System.out.println("다른객체:"+yc1);
	}
	
	public static void method1(YourClass3 yc) {
//		System.out.println("method1:"+yc);
		yc.x = 300;     //실제생성 o 런타임오류x
		
		return;
	}
	
}
//참조타입을 지역변수로 써도, 힙영역의 메모리가 공유됨