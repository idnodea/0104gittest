package java0116;

class Aa {
	private int y;
	int x = 0;
	 void method() {}
	Aa(){
		this.x =0;
	}
	
	Aa(int x){
		this.x = x;
	}
	Aa(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Bb extends Aa{
//	@Override  --수동이든 자동이든  시도하면 오류.
//	protected void name() {
		
//	}
	@Override    //-private 빼주어야함
	void method() {
		super.method();
//		x= 40;                 final 필드 값 변경 안됨
//		System.out.println(x); private 접근 안됨
	}
}