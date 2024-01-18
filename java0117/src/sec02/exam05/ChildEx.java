//0117 3교시

package sec02.exam05;

public class ChildEx {
	
	public static void main(String[] args) {
		
//		Child child1 =new Child();
		
		Parent parent = new Child();  //자식으로 객체생성했지만, 부모에게만 접근이 되네요
		parent.field1 = "data";
		
		parent.method1();    
		parent.method2();
//		parent.field2 = "data";
		/* 
		  
		  parent.method2(); 
		 
		  */
		
		Child child = (Child) parent; //문법상 오류 없음 , 실행상 오류는 있을 수도 있음
		child.field2 = "yyy";
		child.method3();    //자식 변수로 형변환
//		child.method3();
		                                //위에서 아래로 흐른다
										//강제타입변환 부모타입을 자식타입으로o.   자식을 부모로는x
		
		
		
	}
}
