package design.pattern.carfactory;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
//		//퀴즈 미국산 차 생산공장으로 바꾸려면?
////		CarFactory carFactory2 = new StateCarFactory();
////		TireProduct tireProduct2 = carFactory2.createTire();
////		DoorProduct doorProduct2 = carFactory2.createDoor();
////		String tire2 = tireProduct2.makeAssemble();
////		String door2 = doorProduct2.makeAssemble();
////		System.out.println(tire2);
////		System.out.println(door2);
////		
//		//한국차공장
//		CarFactory carFactory = new KoreaCarFactory();
//		TireProduct tireProduct = carFactory.createTire();
//		DoorProduct doorProduct = carFactory.createDoor();
//		String tire = tireProduct.makeAssemble();
//		String door = doorProduct.makeAssemble();
//		System.out.println(tire);
//		System.out.println(door);
		
		
		Scanner scan = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("생산하려는 차종선택 (1:국산 2.미국)");
		System.out.println("선택");
		String key = scan.nextLine();
		switch(key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;	
		default:
			System.out.println("다시 선택해주세요");
			break;
		}
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(door);
		System.out.println(tire);
	}
}
