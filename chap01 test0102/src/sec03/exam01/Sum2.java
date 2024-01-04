package sec03.exam01;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //입력을 위한 준비
		
		System.out.println("숫자입력>");  //처리
		int num1 = Integer.parseInt( scan.nextLine()); //입력
		System.out.println("숫자입력>");  //처리
		int num2 = Integer.parseInt(scan.nextLine());  //입력
		int sum = num1 + num2; //계산
		System.out.printf("두 수의 합은 %d\n",sum);  //출력
	}

}
