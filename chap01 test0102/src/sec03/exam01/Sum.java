package sec03.exam01;

public class Sum {

	public static void main(String[] args) {
		//int x;
		int sum = 0;
		int start =1;  //int start =7;
		int end = 100; //int end = 10;
		
		for (int i = start; i <= end; i++) {
				//System.out.println("i"+i);
				
				//sum= sum + i;
				sum+=i; //sum = sum +i;와 같다
				//System.out.println(start+"부터 " + end + "까지의 합계:"+sum);
				
		}
		System.out.println(start+"부터 " + end + "까지의 합계:"+sum);

	}
}
