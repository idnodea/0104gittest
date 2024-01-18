//0117 1교시 
package sec03.car;

public class GumhoTire extends Tire{
	
	public GumhoTire(String location, int maxRotation) { //생성자
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
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
