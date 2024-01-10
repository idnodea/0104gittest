package sec02.prob05;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = null;     //선언
		int[] arr2 = null;     //선언
		
		
//		int[] arr = new int[]{1,2,3,4,5,};
		System.out.println("크기:");
		int size = scan.nextInt();
//		int[] arr2 = new int[5];
		
		
		arr = new int[size];
//		arr = new int[size];  //초기화   null o
		arr2 = new int[size];  //초기화  null x 힙에 있는 메모리주소를 복사
		
		arr = arr2;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			arr2[1] = 100;
		}
//		arr2[1] = 100;
		System.out.println(arr[1]);
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
