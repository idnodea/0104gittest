package sec05.exam01;

public class CircleEx {

	int radius;
	String name;
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public CircleEx(int radius) {
		this(radius, "어떤 원");
	}
	
	public CircleEx(int radius, String name) {
		
		this.radius = radius;
		this.name = name;
	}




	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10);
		pizza.radius = 10;
		pizza.name = "자바 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(2);
		donut.radius = 2;
		donut.name = "자바 도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}

}