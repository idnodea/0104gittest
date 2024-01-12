package sec01;

public class JavaExam1 {

	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int sum= 0;
		double avg=0.0;
		int max =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			if(max < a[i]) {
				max = a[i];
			}
		}
		avg = sum / (double) a.length;
		System.out.println(avg);
		System.out.println(max);
	}

}
