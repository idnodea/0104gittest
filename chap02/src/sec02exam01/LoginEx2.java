package sec02exam01;

import java.util.Scanner;

public class LoginEx2 {

    // 성명
    public static void checkName(Scanner scan) {
        while (true) {
            System.out.print("이름을 입력하세요:");
            String name = scan.nextLine();

            // 여기서 적절한 조건을 넣어 이름이 숫자인지 문자인지 확인
            if (name.matches(".*\\d+.*")) {
                System.out.println("이름에는 숫자가 포함될 수 없습니다. 다시 입력하세요.");
            } else {
                System.out.println("이름 입력 완료.");
                break;
            }
        }
    }

    // 주민등록번호
    public static void numB(Scanner scan) {
        int ju1 = 0;

        while (true) {
            System.out.print("주민번호 앞 6자리: ");
            ju1 = scan.nextInt();
            if ((ju1 >= 100000) && (ju1 <= 999999)) {
                break;
            } else {
                System.out.println("올바른 주민번호 앞 6자리를 입력하세요.");
            }
        }

        int ju2 = 0;
        while (true) {
            System.out.print("주민번호 뒤 7자리: ");
            ju2 = scan.nextInt();
            if ((ju2 >= 1000000) && (ju2 <= 9999999)) {
                break;
            } else {
                System.out.println("올바른 주민번호 뒤 7자리를 입력하세요.");
            }
        }
    }

    // 전화번호
    public static void numC(Scanner scan) {
        while (true) {
            System.out.print("전화번호: ");
            String phoneNumber = scan.next();
            if (phoneNumber.matches("^010[1-9]\\d{7}$")) {
                break;
            } else {   //저장됬는지o-입력x
                System.out.println("올바른 전화번호를 입력하세요 (010으로 시작하는 11자리 숫자).");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 로그인 | 2. 회원가입 | 3. 예금/출금 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int menuNum = Integer.parseInt(scanner.nextLine());
            switch (menuNum) {
                case 1:
                    // 로그인 처리
                    System.out.print("아이디: ");
                    String loginName = scanner.nextLine();
                    System.out.print("비밀번호: ");
                    String loginpassword = scanner.nextLine();

                    if (loginName.equals("java") && loginpassword.equals("12345")) {
                        System.out.println("로그인 성공");   //하나의 조건으로 묶는 게 아니고
                    } else { 
                        System.out.println("로그인 실패: 아이디 또는 패스워드가 틀림");   //둘로 나눠서 아이디는 맞는데,ㅍ비밀번호틀릴 때 //비밀번호
                    }
                    break;
                case 2:
                    // 회원 가입
                    System.out.println("회원 가입");

                    checkName(scanner);
                    numB(scanner);
                    numC(scanner);

                    break;
                case 3:
                    // 예금 출금
                    System.out.println("예금 출금");
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close(); // Scanner 사용이 끝났을 때 닫아주는 것이 좋습니다.
    }
}