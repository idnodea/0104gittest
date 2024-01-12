package sec01;

public class Exam5 {
	
	public static void main(String[] args) {
		int[][]array = {
				
	    	{85, 96},
		    {83, 92, 96},
		    {78, 77, 93, 87, 88}
					
		};
		
		
		
		//작성위치
		int sum = 0;
		double avg = 0.0;
		
		int count =0;
		for(int i =0; i < array.length ; i++) {
			for(int j =0; j <array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum/ count;
		
		
		System.out.println("sum:" +sum);
		System.out.println("avg:" +avg);
	}
}
