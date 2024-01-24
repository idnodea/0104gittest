//0124 익명객체

package page425;

public class Parent {
	void parentMethod() {};
}
class Child extends Parent {

	@Override
	void parentMethod() {
		// TODO Auto-generated method stub
		super.parentMethod();
	}
	
}

class  A {
	void method1(Parent p) {}
	
	
	
	void method2() {
//		this.method1(field);
//		method1(new Parent());
//		this.method1(new Parent());
//		method1(new Parent());{}
		
//		method1(new Child());
		method1(new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		});
	}
	
	Parent field = new Parent() {

		@Override
		void parentMethod() {
			// TODO Auto-generated method stub
			super.parentMethod();
		}
		
	};
	
	void method() {
		Parent var = new Parent() {

			@Override
			void parentMethod() {
				// TODO Auto-generated method stub
				super.parentMethod();
			}
			
		};
	}
}


