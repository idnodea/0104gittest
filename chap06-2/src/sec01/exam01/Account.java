package sec01.exam01;

public class Account {
	String nation ="대한민국"; //원래 필드엔 이름을 잘 안 넣지만 특별히 예시로
	String name;  //이름필드
	String ssn;	  //생년월일 필드(패스워드)
	String tel;   //
	int age;
	
/*	public Account() {   //생성자(컨스트럭터)  클래스의 형식과 비슷한 메소드=생성자  
  											void등 리턴타입이 없어야함
		
	}     실제로는 만들어야 하는데, 없어도 호출이 된다?   컴파일러가 기본적으로 생성자를 만들어주었다
	*/
	
	public Account() {   //생성자(컨스트럭터)  클래스의 형식과 비슷한 메소드=생성자
		System.out.println("내가 만든 Account()");
	}  /*   
	public Account(String str) {   //두 번째 생성자   ,생성자를 하나라도 만들면 왜 오류?
									//	메서드 오버로딩
	} */
	
	
	//오버로딩  api라이브러리 여럿있지만, 시그니처를 다르게 하여. 생성
	//생성자 오버로딩
	public Account(String name, String ssn, String tel) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
	}
	public Account(String name) {
		this.name = name;
	}
	public Account(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	/*public Account(String s1, String s2) {
		this.name = name;
		this.ssn = ssn;
	} */
	/*public Account(String name, String ssn,String tel) {
		this.name = name;
		this.ssn = ssn;
		this.tel =tel;
	} */
	
	//제너레이트 투스트링
	@Override
	public String toString() {
		return "Account [name=" + name + ", ssn=" + ssn + ", tel=" + tel + ", age=" + age + "]";
	}
	
	//컨스틀럭트 제너레이션 필드
    public Account(String name, String ssn, String tel, int age) {
	//super();  //상속관련. 지워도 상관x  super();
	this.name = name;  //위의 필드와 이름이 같다.  this
	this.ssn = ssn;
	this.tel = tel;
	this.age = age;
}
	
	
	
}
