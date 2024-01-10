package com.roj;

import java.util.Scanner;

public class Project1 {
    static boolean loginStatus;

    public static void login(Scanner scanner, String memberName, String memberSSN) {
        if (loginStatus) {
            System.out.println("이미 로그인 상태입니다.");
            return;
        }

        System.out.print("아이디:");  // 출력문
        String name = scanner.nextLine(); // name 변수의 값 입력
        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();//패스워드 입력

        if (name.equals(memberName)) {
            if (strPassword.equals(memberSSN)) {
                loginStatus = true;
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
    }

    public static void main(String[] args) {
        String memberName = "admin";  // 회원 이름
        String memberSSN = "1111";   // 회원 생년월일 (패스워드로 사용)
        String memberTel = "010-1234-1234";   // 회원 전화번호
        int balance = 0; // 은행 잔고
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        boolean run2 = false;

        AAA: while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int menuNum = Integer.parseInt(scanner.nextLine());

            switch (menuNum) {
                case 1:
                    login(scanner, memberName, memberSSN);
                    break;
                case 2:
                    // ... (기존 코드 유지)
                    break;
                case 3:
                    // ... (기존 코드 유지)
                    break;
                case 4:
                    run = false;
                    break;
            }
        }

        scanner.close();
        System.out.println("프로그램 종료");
    }
}