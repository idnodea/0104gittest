package sec03.exam01;

public class VariableUseExample {
	public static void main(String[] args) {
		//변수 사용
		//변수는 출력문이나 연산식 내부에서 변수에 저장된 값을 출력하거나 연살할 때 사용합니다
		int hour = 3;
		int minute = 5;
		//println() 메소드의 매개값에 변수를 사용하면 변수에 저장된 값을 사용해서 출력합니다. 메소드란 어떤 일을 처리하는 실행문들을 모아놓은 블록을 말합니다.
		
		System.out.println(hour + "시간 " + minute + "분"); //변수 hour와  minute값을 출력
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		//int totalMinute = (hour*60) + minute;
		//int totalMinute = (3*60) + minute; 변수 hour에 저장된 값으로 대치
		//int totalMinute = 180 + 5; 변수minute에 저장된 값으로 대치
		//int totalMinute = 185; 185를 변수 totalMinute에 저장
	}
}
