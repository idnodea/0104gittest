package sec01;

public class Passing2 {
	
	
	//지역변수는 그 블럭에서만 생존한다.
	public static void main(String[] args) {
		int x = 100;  //지역변수

//		int num = method1(); //호출 (이름으로 실행시킨다)  
							//이름은 같은데 method1()=method1(int y) 같은 게 아니니까
//		int num = method1(x);   //오류사라짐
		
		x = method1(x);
//		System.out.println("리턴값:"+num);
		System.out.println("x 값:"+x);
//		System.out.println(y); //y값은 오류

	}

	public static int method1(int y) {   //함수, 메소드
	
		        //y도 지역변수 (단, 호출한 곳에서 값을 넘겨줘야 한다)
						 //return 100->return y로 바꿔도   100이 나오네요?
						//return y의 위치를 아래로 옮겨줬습니다.
		
		y += 1;			//y 오류x
		return y;
		
	}
	
	
}
