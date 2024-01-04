package sec03.exam01;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //입력을 위한 준비
		
		int sum=0;
		
		System.out.println("숫자입력>");  //처리
		int num1 = scan.nextInt();
		System.out.println("숫자입력>");  //처리
		int end = scan.nextInt();    //입력
		System.out.printf("num1: %d, num2: %d\n", num1, end);
		for(int i=num1; i<=end; i++) {
			sum +=i;   //누적을 위한 계산  sum+=i  sum=sum+i
		}
		System.out.println(sum);
		
		
		
	}

}
