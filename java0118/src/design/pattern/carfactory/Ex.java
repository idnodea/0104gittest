package design.pattern.carfactory;

public class Ex {
	public static void main(String[] args) {
		//퀴즈 미국산 차 생산공장으로 바꾸려면?
//		CarFactory carFactory2 = new StateCarFactory();
//		TireProduct tireProduct2 = carFactory2.createTire();
//		DoorProduct doorProduct2 = carFactory2.createDoor();
//		String tire2 = tireProduct2.makeAssemble();
//		String door2 = doorProduct2.makeAssemble();
//		System.out.println(tire2);
//		System.out.println(door2);
//		
		//한국차공장
		CarFactory carFactory = new KoreaCarFactory();
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
	}
}
