package page420;

public class A {
	int x =100;
	void method(int x) {
		String y= "yyy";
//		x=100;
//		y=100;
		class Inner{
			void method() {
				String z = x + y;
			}
		}
	}
	static class B{
		void method() {
//			System.out.println(A.this.x);
		}
	}
}
