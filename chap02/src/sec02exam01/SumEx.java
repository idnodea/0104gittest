package sec02exam01;

import java.util.Scanner;

public class SumEx {

	public static void sum(Scanner scanner) {  //static 정적 메서드  Scanner scanner를 넘겨준다
		//Scanner scanner;
		//Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
				
		
		
	}
	
	public static void multi(Scanner scanner) {
		
		System.out.print("처음 수:");
		String strNum3 = scanner.nextLine();
		System.out.print("다음 수:");
		String strNum4 = scanner.nextLine();
		int num3 = Integer.parseInt(strNum3);
		int num4 = Integer.parseInt(strNum4);
		int result2 = num3 * num4;
		System.out.println("곱셈 결과:" + result2);
	}
	
	
	
	
	public static void main(String[] args) {    //ctrl shift o   
		
		Scanner scanner = new Scanner(System.in);   //new를 그냥 한번만 쓰려고. 어디 넣어도 상관없겠지만
		/*
		int x =100;
		{	int y =200;
			System.out.println(x+","+y);
		}
		int x2 =100;
		//System.out.println(y);
		{	int y3 =200;
		System.out.println(x2+","+y3);
		}  */
		
		sum(scanner);
		
		
		multi(scanner);
		
		
		
	}
//	public static void cross() {
		
//	}
	
	
	
		
		
	

}
