package sec02.exam06;

public class Instanceof {
	
	public static void main(String[] args) {
		Parent  parentA = new Child();	//데이터타입만 부모썼지만 실체는 자식.
		method2(parentA);    //오류x
		
//		Parent parentB = new Parent();
//		method2(parentB);   //오류
//		Parent parentB = new Parent();
		Parent parentB = new Child();
		if(parentB instanceof Child) {  //객체-타입순
			method2(parentB);
		}else {
			System.out.println("변환 불가");
		}
		
	}
	public static void method2(Parent parent) {
		Child child =(Child) parent;     //오류
//		System.out.println("method2 - Child로 변환 성공");
		
		System.out.println("변환가능");
	}
	
	
}
