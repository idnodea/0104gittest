package sec02exam01;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

    public static int createNumber(Random random) {
        //Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static void multiplication() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int num1 = createNumber(random); // createNumber 메서드로 변경
        int num2 = random.nextInt(90) + 10;
        int multi = num1 * num2;
        System.out.printf("%d X %d = ?\n", num1, num2);

        for (;;) {
            // 무한 반복 (무한 루프)
            System.out.println("입력>");

            int answer;
            try {
                answer = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("올바른 정수를 입력하세요.");
                continue;
            }

            if (answer == multi) {
                System.out.println("정답");
                break; // 탈출
            } else {
                System.out.println("오답");
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            multiplication();
        }
    }
}