package sec05.exam01;

public class Circle3 {

	int radius;
	
	public Circle3(int radius) {
		this.radius = radius;
	}
	
	public void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle3 cir1 = new Circle3(2);
		System.out.println(cir1.radius);
//		Circle2 cir2 = cir1;
		cir1.set(4);
		System.out.println(cir1.radius);
		cir1.set(5);
		System.out.println(cir1.radius);
		cir1.set(6);
		System.out.println(cir1.radius);
		

	}

}