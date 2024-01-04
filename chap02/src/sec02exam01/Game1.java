package sec02exam01;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = random.nextInt(10)+1;  //0~
		int num2 = random.nextInt(90)+10;
		int multi = num1 * num2;
		
		System.out.printf("%d X %d = ?\n", num1, num2);
		
		for(;;) {
			//무한 반복 (무한 루트)
			System.out.println("입력>");
			
			int answer = Integer.parseInt(scan.nextLine());
			if(answer == multi) {
				System.out.println("정답");
				break;  //탈출
			} else {
				System.out.println("오답");
			}
			
		}
		System.out.println("종료");
	}

	private static void Random(Random random) {
		// TODO Auto-generated method stub
		
	}

}
