package sec02exam01;

import java.util.Random;

public class GameMulti {

	public static void main(String[] args) {
		
		Random rd1 = new Random();
		//System.out.println(rd1.nextInt(10)+1);
		int rdn1 = rd1.nextInt(10)+1;
		
		Random rd2 = new Random();
		//System.out.println(rd2.nextInt(10)+1);
		int rdn2 = rd2.nextInt(10)+1;
		
		for(int rnd1 = 0; rnd1<10; rnd1++) {
			for(int rnd2 = 0; rnd2<10; rnd2++) {
				System.out.println("rd난수1 X rd난수2: " + (rnd1 * rnd2));
			}
			
		}
		int rnd1 = 0;
		//System.out.println("rd난수X rd난수2: "+ rnd1 * rnd2);
		
		
		//for(int i=0; i<10; i++) {
			
			//System.out.println(i);
			//for(int cross=0; cross<10; cross++) {
				//System.out.println(cross);
			//}
		//}
	}

}
