//0117 1교시 
package sec03.car;

public class Tire {
	//필드
	public int maxRotation;   //최대회전수(타이어수명)
	public int accumulatedRotation; //누적 회전수
	public String location;	//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) { //생성자
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;   //누적회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명:" + 
		    (maxRotation - accumulatedRotation)+"회");
			return true;    //정상회전(누적<최대)일 경우 실행
			
		} else {
			System.out.println("***"+location+ "Tire펑크 ***");
			return false;   //펑크(누적=최대)일 경우 실행
		}
	}
}
