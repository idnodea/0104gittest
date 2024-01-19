//0118 1교시
package sec03.exam01;

public abstract class SmartPhone  extends Phone{   //추상클래스는 extends 뒤
													//아래 임플리먼트를 없애면 abstract추가
										//자식도 추상클래스로 만들어지면? 객체생성은 자식의 자식이
	
//	public static void main(String[] args) {
		
//		Phone phone = new Phone();   //
//		Phone phone = null;
//		SmartPhone sp =(SmartPhone) phone;
		
		public SmartPhone(int x) {
			super(x);
//			this.x=x;
		}
		
		
//		//소스-임플리먼트
//		@Override
//		public String ring(int tel) {
//			// TODO Auto-generated method stub
//			return null;
//		}    //만약 없애면  ->
		public abstract void test();       //자식도 추상클래스로 만들어지면? 객체생성은 자식의 자식이
		
//	}
}
