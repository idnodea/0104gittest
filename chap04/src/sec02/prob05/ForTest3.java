package sec02.prob05;

public class ForTest3 {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
//			System.out.println(i);
			for(int j=3; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
//				System.out.println(j);
//				System.out.println();
			}
			System.out.println();
		} 
		
		
	}

}
