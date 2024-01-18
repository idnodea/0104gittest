//0116 3교시

package java0116;

public class Student extends People {
	String hakbun;
	
	public Student(String name,String hakbun) {
//		System.out.println(); -
		
//		super(); //부모의 생성자 호출(여기서는 기본생성자 호출?)-
		
//		super("홍길동"); //부모의 생성자 호출(여기서는 기본생성자 호출?)
						//p315
//		super(name); //하나만 호출해도 됩니다
					//super가 없이 오류x->super써주면 오류x
					//->super 안에 생성자 써주어야 오류x-> super없이도 오류x
		
		this.hakbun =hakbun;
//		this.name = name;
		
		
//		이론적으로 부모-자식순
//		코드상으론 자식-부모일 수 있음  
//실행한다면? 자식만 실행되고 부모는 실행이 안된다?
		
		
	}
	
	void method3() {
		super.method1();
	}
	
	
	//소스-오버라이드
	@Override
//	void method1(int x) {  
	void method1() {    
		System.out.println();
		// TODO Auto-generated method stub
		super.method1(); //부모의 메소드 실행(생략 가능)
	} 
} 

//super의 경우, 부모의 생성자가 있다면 필요없겠네요?
//ChatGPT
//맞습니다. super 키워드는 주로 부모 클래스의 생성자를 호출할 때 사용됩니다. 하지만 만약 부모 클래스에 기본 생성자가 있고, 자식 클래스에서 명시적으로 다른 생성자를 호출하지 않는다면 자바 컴파일러는 자동으로 부모 클래스의 기본 생성자를 호출합니다. 따라서 super 키워드를 명시적으로 사용하지 않아도 됩니다.
//
//만약 부모 클래스에 매개변수가 있는 생성자가 있는 경우, 자식 클래스에서 생성자를 정의할 때 super(인자)를 통해 부모 클래스의 해당 생성자를 명시적으로 호출해야 합니다. 그렇지 않으면 컴파일러가 기본 생성자를 호출하는 것이 아니라 오류가 발생할 것입니다.
//
//간단한 예제로 설명하면:
//
//java
//Copy code
//public class Parent {
//    public Parent(int x) {
//        // 부모 클래스의 생성자
//    }
//}
//
//public class Child extends Parent {
//    public Child(int y) {
//        // 부모 클래스의 생성자를 명시적으로 호출
//        super(y);
//        // 나머지 자식 클래스의 초기화 작업
//    }
//}
//이 경우에는 super(y)를 사용하여 Parent 클래스의 생성자를 호출하고 있습니다. 만약 super(y)를 사용하지 않으면 컴파일 오류가 발생합니다.
