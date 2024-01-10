package sec04.exam01;

public class CalEx {
	
	
	
	public static void main(String[] args) {//static:객체생성과 상관없이 값을 줄 수 있음
		Cal.sx=500;
		Cal cal = new Cal();    //객체가 없고  실체는 힙영역에 
		cal.power();
		cal.x = 100;
		cal.printX();
		
		Cal cal2 = new Cal();
		System.out.println(cal2.x);
		cal2.power();
		
	}
}
