package sec01;

public class JavaExam3 {
	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int sum=0;
		int max=0;
		double avg=0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			
			if(a[i]>=max) {
				max = a[i];
			}
		} System.out.println("max: "+max);
		avg = (double) sum /a.length;
		System.out.println("avg: "+avg);
		System.out.println("sum: "+sum);
		
	}
}
