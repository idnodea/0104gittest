package sec04.exam;

public class MyClass implements InterTest{
	public static void main(String[]args) {
		InterTest.test777();   //스태틱추상메서드의 활용(객체생성과 상관x)
		InterTest it = new MyClass();
		it.test();
		it.test1();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void test1() {
		// TODO Auto-generated method stub
//		InterTest.super.test1();
		System.out.println("새로운 test1");
	}

//	//오류로 인한 추가  -이걸 일일히 수백수천개를 한다?
//	@Override
//	public void test3() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	//프라이베이트 추상메서드호출 불가능
	
}
