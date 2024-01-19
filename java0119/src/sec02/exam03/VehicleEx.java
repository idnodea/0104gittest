package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

class Acc {
	
	
}

public class VehicleEx {
//	ArrayList list = new ArrayList();
//	ArrayList<> list = new ArrayList();
	
	
	public static void main(String[]args) {
//		List list = new ArrayList();  //이걸로 하면 다 되다가
		List<String> list = new ArrayList(); //이걸로 문자열만 되고?  
//		List<Acc> list = new ArrayList(); //
//		list.add(123);
		list.add("문자열");
//		list.add(3.14);
//		list.add(new Acc());
		
		for(Object obj : list) {  //받아주다가,
			
//			String str = obj;  //강제형변환은 상속과 관련있음
							  // //받아주다가, 이런 코드를 넣으니 안 받음.
			String str = (String) obj;//받게끔 수정
			
			System.out.println(obj);
//			System.out.println(obj);
		}
		
		Vehicle vehicle = new Bus();
	}
}
