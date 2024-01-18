//0116 3교시
package java0116;     //왠만하면 클래스는 하나만, 두셋을 써도 퍼블릭은 하나만

class Parent2 {}
class Parent{ //부모클래스
	int money=100;
	
	void disp() {
		System.out.println(money);
	}
}

//public class Child extends Parent, Parent2{  //자바에선 다중상속허용x 
public class Child extends Parent{  //자식클래스 	
	public Child(){  //생성자
//		this.money = 300;      //출력값 100->300->400
		this.money += 300;		
	}
	
	
	public static void main(String[] args) {
		Child ch = new Child();
		
		ch.disp();  //부모의 메소드 실행
//		System.out.println(ch.money);
	}

}
