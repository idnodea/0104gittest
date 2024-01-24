package page427;

class Parent{
	void parentMethod() {}
}

public class A {
//	Parent field;   //필드
	Parent field = new Parent() {
		int childField;   //이름이 있으면 접근가능
							//이름이 없어서 접근불가
		void childMethod() {
			
		}
	};             //필드:Parent의 익명 자식 객체 생성
	
	
	
	void method() {
		field.parentMethod(); //이건 접근가능, 왜?
	} //메소드
}
