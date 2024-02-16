package lamda;

public class MyFuncEx {

	public static void main(String[] args) {
		MyFunc mf, mf2, mf3, mf4;
		
		
		
		mf4= x ->{
			System.out.println(x);
		};
		
		mf3 = (a)-> 
//		{
			//문장이 하나면 대괄호도 생략가능함
			System.out.println("method");
//		};
		mf3.method(20);		
		
		//람다식
		mf = new MyFunc() {
			
			@Override
			public void method(int x) {
//				System.out.println("method");
				System.out.println(x);
				
			}
		};
		mf.method(10);
		
		mf2 = (a) -> {System.out.println("method");};
		mf2.method(20);
	}

}
