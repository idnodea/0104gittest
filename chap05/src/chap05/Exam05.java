package chap05;

public class Exam05 {

	public static void main(String[] args) {
		int[] array2 = {80,78,97};
		double[] array = new double[] {80.6,90.0,97.1};
		
		double sum =0;
		double avg;
		//총합, 평균 출력
		for(double num :array) {
			sum+=num;
			
		}
		System.out.println("총합:"+sum);
		
		avg=(double) sum/array.length;
		System.out.println("평균:"+avg);
	}

}
