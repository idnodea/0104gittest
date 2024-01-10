package sec02.exxam01;

public class Car {
	String company;   //변수x 필드o  객체와 비슷   객체의 성격
	String model;
	String color;
	int maxSpeed;
	
	
	
//	public Car(String str) { 생성자o 시작 만들지 않아도 기본지원. 그러나 만들면(서술해버리면o)? 책임
//		
//	}
	public Car() { //생성자o 시작 만들지 않아도 기본지원. 그러나 만들면x(서술해버리면)? 지원x
		System.out.println("Car()");
	}
	public Car(String str) {  //똑같은 생성자 만들면 오류, 그러나 괄호안 변경-메소드오버로딩
		company = str;  //생성자가 왜 매개변수를 쓰는지?
	}
	
	public Car(String str,String str1) {
		company = str;
		model = str1;
	}
		
	
	public Car(String company, int maxSpeed) {  //오버로딩. 
		super();
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	public Car(String company, String model, String color, int maxSpeed) {
//		super(); 소스 제너레이트-컨스트럭ㅌ 앤 필드
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [copany=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
}
