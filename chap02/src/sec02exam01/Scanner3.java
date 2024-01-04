package sec02exam01;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("아이디: ");
        String name = scan.nextLine();

        System.out.print("패스워드: ");
        String strPassword = scan.nextLine();
        // int password = Integer.parseInt(strPassword); // 이 부분은 선택적으로 사용

        boolean isNameValid = true; // 여기서는 예시로 항상 유효하다고 가정
        boolean isPasswordValid = true; // 여기서는 예시로 항상 유효하다고 가정

        if (isNameValid) {
            if (isPasswordValid) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패: 패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패: 아이디 존재하지 않음");
        }
    }
}