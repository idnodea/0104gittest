package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

class MyClass{}
interface Inter{}
class Acc2 {
	Inter inter;
//	MyClass mc;	
	MyClass mc = new MyClass();	
	int x;
	String str;
	String method(){
//		return "문자열";
		return str;
		
	} //필드가 값저장 메소드는 실행(기능)
}

public class VehicleEx2 {
//	ArrayList list = new ArrayList();
//	ArrayList<> list = new ArrayList();
	Vehicle vehicle = new Bus();  //이동완료
//	vehicle.checkFare(); 강제형변환불가능
//	Bus bus = vehicle;
	Bus bus = (Bus) vehicle;  //이렇게 강제형변환
//	vehicle.run();
//	bus.checkFare();  //이렇게 쓰는 게 룰
	
	
	public static void main(String[]args) {
		new Bus().checkFare();  //이렇게 하면
//		new Bus().checkFare(); 
//		new Bus().checkFare();  
//		new Bus().checkFare();  
//		new Bus().checkFare();  
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		new Bus().checkFare(); 
		if(vehicle instanceof Bus) {
			System.out.println("가능");
		}
		Bus bus =(Bus) vehicle;
		bus.checkFare();
		
		
//		Bus bus = (Bus) vehicle;  

//		bus.checkFare();  //이렇게 하면 ....
//		Bus bus = (Bus) vehicle;
//		vehicle.run();
//		bus.checkFare();
		
//		String str = new String("테스트");
		String str = "테스트";
		String str1 = "";
		for(int i = 0;i<100; i++) {  //성능고민필요?
			str1 += str;			//String들이 문자열들이
									//좋은 코드는 아님
		}
		System.out.println(str1);
//		List list = new ArrayList();  //
		List<Acc2> list = new ArrayList<>(); //
//		List<Acc> list = new ArrayList(); //
//		list.add(123);
//		list.add("문자열");
//		list.add(3.14);
		list.add(new Acc2());
		
//		List<Acc, String> list2 = new ArrayList<>(); 
//			<> 안에는 하나만 가능
		
		
		for(Object obj : list) {  //받아주다가,
			
//			String str = obj;  //강제형변환은 상속과 관련있음
							  // //받아주다가, 이런 코드를 넣으니 안 받음.
			Acc2 acc = (Acc2) obj;//받게끔 수정
			
			System.out.println(obj);
//			System.out.println(obj);
		}
		
//		Vehicle vehicle = new Bus();  //위로 이동
	}
}
