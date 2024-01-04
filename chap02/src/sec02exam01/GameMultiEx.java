package sec02exam01;

import java.util.Random;

public class GameMultiEx {

	public static void main(String[] args) {
		
		Random rd1 = new Random();
        int rdn1 = rd1.nextInt(10) + 1;

        Random rd2 = new Random();
        int rdn2 = rd2.nextInt(10) + 1;

        System.out.println("rd난수1 X rd난수2: " + (rdn1 * rdn2));
	}

}
