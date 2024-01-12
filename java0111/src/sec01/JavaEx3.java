package sec01;

public class JavaEx3 {

	public static void main(String[] args) {
		
		int x= 10;
		int y =20;
		
		for(int i =0;i<21; i++) {
			
			int swap = x;
			x = y;
			y = swap; 
			break;
		}
		System.out.println("변환된 x의 값:"+x);
		System.out.println("변환된 y의 값:"+y);
		
	}

}
