package sec01;

public class Passing1 {
	
	
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);   //여기까지 실행하다 
		
		int num = method1(); //위로 갔다가
								//호출 (이름으로 실행시킨다)
		System.out.println(4);  //받은 값을 보여준다
	}

	public static int method1() {   //함수, 메소드
		System.out.println(3);
		return 100;         //위로 와,  값을 받아서
	}
	
	
}
