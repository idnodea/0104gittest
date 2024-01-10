package sec05.exam01;

public class MyClass {
	int x;
	int y;
	int z;
	
	//소스 제너레이트 
	public MyClass(int x) {
//		this.x = x;
		this(x, 0, 0);
		System.out.println("1번째 생성자");
	}
	
	
	public MyClass(int x, int y) {
//		this.x = x;
//		this.y = y;
		this(x,y,0);
		System.out.println("2번째 생성자");
	}
	
	public MyClass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("특별 명령");
		System.out.println("3번째 생성자");
	}
	
	//소스 투스트링
	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
	}


	public void main(String[] args) {
		
		MyClass mc =new MyClass(100);
		System.out.println(mc);
		MyClass mc2 =new MyClass(100,200);
		System.out.println(mc2);
	}
}
