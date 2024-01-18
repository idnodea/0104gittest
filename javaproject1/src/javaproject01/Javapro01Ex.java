package javaproject01;

import java.util.Scanner;

public class Javapro01Ex {

    static boolean run1 = true;
    static boolean run2 = true;

    public static void disMain2() {
        System.out.println("-----------------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.예금메뉴종료");
        System.out.println("-----------------------------------------");
    }

    public static void disMain() {
        System.out.println("-----------------------------------------");
        System.out.println("1.회원출력 | 2.회원등록 | 3.로그인 | 4.파일저장 | 5.파일읽기 | 6.종료");
        System.out.println("-----------------------------------------");
    }

    public static void main2() {
        Scanner scanner = new Scanner(System.in);
        disMain2();
        System.out.println("선택:");
        while (run2) {
            int numIn = Integer.parseInt(scanner.nextLine());
            switch (numIn) {
                case 1:
                    System.out.println("1.예금");
                    break;
                case 2:
                    System.out.println("2.출금");
                    break;
                case 3:
                    System.out.println("3.잔고");
                    break;
                case 4:
                    System.out.println("4.예금메뉴종료");
                    run2 = false;
                    break;
            }
        }
        System.out.println("예금메뉴 종료");
    }

    public static void main1() {
        Scanner scanner = new Scanner(System.in);
        disMain();
        System.out.println("선택:");
        while (run1) {
            int numIn = Integer.parseInt(scanner.nextLine());
            switch (numIn) {
                case 1:
                    System.out.println("1.회원출력");
                    break;
                case 2:
                    System.out.println("2.회원등록");
                    break;
                case 3:
                    System.out.println("3.로그인");
                    break;
                case 4:
                    System.out.println("4.파일저장");
                    break;
                case 5:
                    System.out.println("5.파일읽기");
                    break;   
                    
                case 6:
                    System.out.println("5.종료");
                    run1 = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    public static void StartMenu() {
        Scanner scanner = new Scanner(System.in);
        disMain();
        main1();
        main2();
    }

    public static void main(String[] args) {
        StartMenu();
    }
}