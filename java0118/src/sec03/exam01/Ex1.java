//0118 1교시
package sec03.exam01;

public class Ex1 {
	
	public static void main(String[]args) {
//		Phone phone = new SmartPhone2();
		Phone phone = new SmartPhone2(10, 20); // 매개변수 필요
		System.out.println(phone.x);   
		if(phone instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) phone;  //강제형변환불가. 부자x형제o이므로
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
	
}
