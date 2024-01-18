//0117 1교시  부모의 것을 자식은 전부, 

package sec02.exam02;

public class Child extends Parent{

	
	//소스-오버라이드 임플리멘트
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}
