package sec04.exam;

public interface InterTest {
////	public default void test1() {
//	void test();  //추상메소드
//	default void test1() {
//		System.out.println("test1()");
//	}
	
   // 만약 10년 20년 뒤, 수정을 하게되면
	void test();  //추상메소드
	default void test1() {
		System.out.println("test1()");
	}
//	void test3();   //이문구 넣으면 MyClass1,2 오류 
	default void test3() {//그래서 디폴트 추상메소드를 만들었다(확장개념)
		test41();   //프라이베이트추상메서드 활용   내부에서만.
	};		
	private void test41() {  //인터페이스 내에서 호출할 용도
		System.out.println("test41프라이베이트추상메서드");
	};
	
	static void test777() {   //프라이베이트추상메서드의 반대
//		test41(); 오류
		
		System.out.println("스태틱추상메서드");
	};
	//추상메서드는 {};  ;를 붙인다
}
