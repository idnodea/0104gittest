package chap00;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int sum;
		int score1=0;
		int score2;
//		sum=score1+score2;
		
		int v1=0;
		if(true) {
			int v2 = 0;
			int v3= 0;  //변수선언 범위 안으로
			
			if(true) {
//				int v3= 0;
				v1= 1;
				v2= 1;
				v3= 1;
				
			}
			v1=v2+v3;
		}
		System.out.println(v1);
		
	}
}
