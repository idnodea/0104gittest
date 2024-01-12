package sec02.exam03;

//아래의 메소드들은 어떤 일을 하나요?(어떤 값을 다루고 있나요?)
//메소드가 하는 일은 무엇일까?


public class Car {  //필드값 수정 검색 넘겨준다거나
	//필드 
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {  //리턴값이 없는 메소드로 매개값을 받아서 gas필드값을 변경
		this.gas =gas;
	}
	
	boolean isLeftGas() {   //리턴값이 boolean인 메소드로 gas필드값이 0이
		if(gas ==0) {		// false를, 0이 아니면 true를 리턴
			System.out.println("gas가 없습니다");
			return false; //false를 리턴
		} 
		System.out.println("gas가 있습니다");
		return true;  //true를 리턴
	}
	
	void run() {    		//리턴값이 없는 메소드로 gas필드값이 0이면 return문으로
		while(true) {		//메소드를 강제종료
			if(gas>0) {
				System.out.println("달립니다(gas잔량:"+gas+")");
				gas -=1;
			} else {
				System.out.println("멈춥니다(gas잔량:"+gas+")");
				return;		//메소드 실행종료   return으로 쓴건, 메소드니까
//				break;      //return을 break로 변경해도 되지만
			}
		}
	}
	
}
