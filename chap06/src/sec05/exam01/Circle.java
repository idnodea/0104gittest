package sec05.exam01;

public class Circle {
	int radius;			//원의 반지름 필드
	String name;		//원의 이름을 필드
	
	public double getArea() { //멤버 메소드
		return 3.14*radius*radius;
	}
	public Circle(int radius) {
		this(radius, "어떤 원");
	}
	
	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}
	
	

	public static void main(String[] args) {  
		Circle pizza;
		pizza = new Circle(7);   //Circle 객체 생성
		pizza.radius = 10; 		//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";   //피자의 이름 설정
		double area = pizza.getArea(); //피자의 면적 알아내기
		System.out.println(pizza.name+"의 면적은 "+area);
		
		
		Circle donut = new Circle(7);  //Circle 객체 생성
		donut.radius = 2;             //도넛의 반지름을 2로 설정
		donut.name = "자바도넛";         //도넛의 이름 설정
		area = donut.getArea();       //도넛의 면적 알아내기
		System.out.println(donut.name+"의 면적은 "+area);
	
	}
	
}
