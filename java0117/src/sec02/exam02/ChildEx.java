//0117 1교시  부모의 것을 자식은 전부,   단 변수?

package sec02.exam02;

public class ChildEx {
	
	public static void main(String[] args) {
		Child child = new Child();    //상속받았으니 이건 되지만
//		Child child = new Parent();		//역으론 x
		
//		int x =100;
//		double y =x;
		
		Parent parent = child;   //대입가능
		parent.method1();  //Parent-method1()   //실행값  //부모값은 실행됬지만
		parent.method2();  //Child-method2()    //실행값  //자식이 갖고 있던 값을 왜 실행못할까?  
												//되게 하려면 방법이 따로 있음
		
		
//		parent.method3();  //호출불가
		
//		Parent parent = child;
	}
	
}
