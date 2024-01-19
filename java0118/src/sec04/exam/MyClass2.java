package sec04.exam;

public class MyClass2 implements InterTest{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		InterTest.super.test1();
	}

//	//오류로 인한 추가  -이걸 일일히 수백수천개를 한다?
//	@Override
//	public void test3() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
}
