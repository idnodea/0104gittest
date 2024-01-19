package sec01.exam02;

public class Ex {
	public static void main(String[] args) {
		
		
//		new RemoteControl(); 인터페이스이므로 변수선언x,객체생성불가 =>구현x 
		
//		RemoteControl rc = new Audio();
		RemoteControl rc;
		rc = new Audio();
		rc.turnOn();
		System.out.println(rc.Max_VOLUME);
//		rc.Max_VOLUME=100; 오류임. 상수이므로.
		
	}
}
