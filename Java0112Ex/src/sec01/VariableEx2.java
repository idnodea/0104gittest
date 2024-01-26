//변수값 교환-새로운 변수를 선언해 교환한다

package sec01;

public class VariableEx2 {
	public static void main(String[] args) {
		int x= 3;
		int y=5; System.out.println("x"+x+",y:"+y);
		
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x:"+ x+ ",y:" + y);
	}
}
