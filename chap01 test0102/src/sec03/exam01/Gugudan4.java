package sec03.exam01;

import java.util.Scanner;

public class Gugudan4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        for(;;) {
        	System.out.print("단을 입력(종료시 q)");
        	str = scan.nextLine();
        	if(str.equals("q")){
        		break;
        	}
        	int dan = Integer.parseInt(str);
        	for(int i = 1; i <=9; i++) {
        		System.out.printf("%d X %d = %d\n", dan, i, dan * i);
        	}
        }
        System.out.println("종료");
        		
    }
}