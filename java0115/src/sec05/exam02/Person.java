package sec05.exam02;

public class Person {
	
	public static final double PI1 = 3.141592; //상수  /선언과 동시에 값을 줘야함
//	public static final double PI = 3.141592; //상수  타입(여기선 double)을 제외한 속성들은 자리변경가능
	
	static int y;
	
	final String name;  //final넣었을 때, 오류.아래와 같이 변경
// 	final String name = "이름";
	
	
	
	public Person(String name) {
//		this.name = name;
		this.name = name;
//		person.y = y;
//		PI= 3.14;
		
	}
 	
	public static void main(String[] args) {
		System.out.println(Math.PI);
//		Person Person = new Person();       //final넣었을 때, 오류.아래와 같이 변경
		Person Person = new Person("홍길동");
//		Person.name = "홍길동";
		final int x; //한번만 초기화. 한번 준 값이
		x = 300;
//		x = 500;
	}

}
