//0117 1교시 
package sec03.car;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);     //슈퍼로 끝내야 오류x
		// TODO Auto-generated constructor stub
	}  //상속을 받는데, 부모의 생성자가 있다면, 자식도 생성자가 있어야 상속가능
	
	
	//소스-임플리먼트
	@Override
	public boolean roll() {
//		++accumulatedRotation;   //누적회전수 1증가
//		if(accumulatedRotation < maxRotation) {
//			System.out.println(location + "Tire 수명:" + 
//		    (maxRotation - accumulatedRotation)+"회");
//			return true;    //정상회전(누적<최대)일 경우 실행
//			
//		} else {
//			System.out.println("***"+location+ "Tire펑크 ***");
//			return false;   //펑크(누적=최대)일 경우 실행
//		}
		++accumulatedRotation;   //누적회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명:" + 
		    (maxRotation - accumulatedRotation)+"회");
			return true;    //정상회전(누적<최대)일 경우 실행
			
		} else {
			System.out.println("***"+location+ "HankookTire펑크 ***");
			return false;   //펑크(누적=최대)일 경우 실행
		}
	}
	
	
	
}
