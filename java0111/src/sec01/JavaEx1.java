package sec01;

import java.util.Scanner;

public class JavaEx1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
//		
//	System.out.println("A의 점수:"+x);
//	int x = scan.nextInt();
//	System.out.println("B의 점수:"+y);
//	int y = scan.nextInt();
//	
	int a[] = {1,3,10,2,8};
	int sum =0;
	double avg = 0;
	
	//합계
	for(int i=0; i < a.length; i++) {
			
		
		
			
			sum += a[i];
			System.out.printf("sum: "+sum);
	
	}
	//평균
	for(int i=0; i<a.length; i++) {
			
		
		for(int j=0; j<a.length; j++) {
			avg = (double) sum /a.length;
			System.out.printf("avg: "+avg);
		}
	}
	//최대값
	for(int i=0; i<a.length; i++) {
		
		int max = 0;
		if(a[i] > max) {
			max=a[i];
			
			System.out.printf("최댓값: "+max);
			
		}
	}
	
	
	
	}

}
