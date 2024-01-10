package sec01.exam01;

public class AccountEx {
	
	public static void main(String[] args) {
		Account acc = new Account();  //클래스이름과 똑같은 메소드  =생성자 / 메소드호출
										//처음엔 매개변수없는 놈을 호출
		acc.name = "임진수";
		acc.ssn ="901120";
		acc.tel="01094199419";
		acc.age=34;
		System.out.println(acc);  //account 에서 소스 제너레이트투스트링
		System.out.println(acc.name);
		
		Account acc1 = new Account("임진수", "901120", "01094199419", 33);
		System.out.println(acc1);
	}
	
	
}
