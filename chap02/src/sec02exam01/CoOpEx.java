package sec02exam01;

public class CoOpEx {

	public static void main(String[] args) {
		int score = 95;
		//char grade = (score > 90) ? 'A' : 'B';
		
//		char grade = (score > 90) ? "합격" : "불합격";
		char grade = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		/*
		if(score>90) {
			grade = 'A';
		}else if(score>80){
			grade= 'B';
		} else{
			grade= 'C';
		}
		
		*/
		
		System.out.println(grade);	
	}

}
