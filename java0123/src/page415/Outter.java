package page415;

public class Outter {
	public void method2(final int arg) { //매개변수
	    final int localVar =1;		   //지역변수
//		arg = 100;    // 재정의 x 값추가로 바꾸지말고.
//		localVar=100;  //
		class Inner {  //내부클래스가 쓰레드같은 곳에서 작동될 때의 오류를 없애기위함임.final
			public void method() {
				int result = arg + localVar; 
				//지역변수들  final문제때문에 위의 코드를 사용할 수 없음
				//쓰레드문제때문에 final을 붙여줌
			}
		}
	}
}
