package sec02.prob05;

import java.util.Scanner;

public class ContinueEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr2 = null;     //선언
		
		int[] arr = {1,2,3,4,5,};
//		int[] arr = new int[]{1,2,3,4,5,};
		System.out.println("크기:");
		int size = scan.nextInt();
//		int[] arr2 = new int[5];
		arr2 = new int[size];  //초기화
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	/*	
		for(int i =0; i<10; i++ ) {
			System.out.println(i);
			if(i ==6) {
//				continue;  //만 하지 않는다 - 아래로 분기  
				break;  //돌아간다        -  위로 분기
			}
			
			System.out.println("나올까요");
		}  */
 	} 
}
