package com.roj;

import java.util.Scanner;

public class IFEseIfElseEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수");
        int score = scan.nextInt();

        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                System.out.println("A입니다");
            } else if (score >= 80) {
                System.out.println("B입니다");
            } else if (score >= 70) {
                System.out.println("C입니다");
            } else {
                System.out.println("D입니다");
            }
        } else {
            System.out.println("점수 오류");
        }
    }
}

