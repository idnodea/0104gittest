package sec02exam01;

import java.util.Scanner;

public class SumEx2 {

	public static void sum(int num1, int num2) {  //static 정적 메서드  Scanner scanner를 넘겨준다
		
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}
	
	public static void multi(int num1, int num2) {
		
		
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}

	public static void main(String[] args) {    //ctrl shift o   
		
		Scanner scanner = new Scanner(System.in);   //new를 그냥 한번만 쓰려고. 어디 넣어도 상관없겠지만
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int n1 = Integer.parseInt(strNum1);
		int n2 = Integer.parseInt(strNum2);
		
		sum(n1,n2);
		multi(n1,n2);
	
	}
//	public static void cross() {
		
//	}
	
	
	
		
		
	

}
