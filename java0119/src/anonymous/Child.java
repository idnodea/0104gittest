package anonymous;

class Parent {
	void method() {}
}
public class Child extends Parent{
	
	
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[]args) {
		Parent parent =new Child();   //대입
//		Child child = parent;
//		Child child = (Child) parent3;  //이름을 주었다.
		
		
		
		
		
		
		
		
		new Child(); //익명 객체
		
//		new Parent(){  
//
//			@Override
//			void method() {
//				// TODO Auto-generated method stub
//				super.method();
//			}
//			
//		};
		Parent parent1 = new Parent();
		Parent parent2 = new Parent(){

			@Override
			void method() {
				// TODO Auto-generated method stub
				super.method();
			}

		};
		
		
	}
}
