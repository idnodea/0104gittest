package sec02exam01;

import java.util.Scanner;

public class LoginEx3 {

    // 성명
    public static void checkName(Scanner scan) {
        while (true) {
            System.out.print("이름을 입력하세요:");
            String name = scan.nextLine();

            // 
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
            } else {   
                System.out.println("올바른 전화번호를 입력하세요 (하이픈-없이 010으로 시작되어야합니다)."); //01051559419
            }
        }
    }
    public static void infoSave(Scanner scan) {
    	
    	String savedId = "java";
    	String savedPassword = "12456";
    	int savedJu1 =1111111;
    	int savedJu2 =11111111;
    	String savedPhoneNumber = "01012345678";
    	
    	System.out.println("가입 정보가 저장되었습니다.");
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
                    
                    
                    if (loginName.equals(savedId)) {
                        if (loginpassword.equals(savedPassword)) {
                            System.out.println("로그인 성공");
                        } else {
                            System.out.println("로그인 실패: 비밀번호가 틀림");
                        }
                    } else {
                        System.out.println("로그인 실패: 아이디가 존재하지 않음"); 
                    }
                    break;
                case 2:
                    // 회원 가입
                    System.out.println("회원 가입");

                    checkName(scanner);
                    numB(scanner);
                    numC(scanner);
                    
                    infoSave(scanner);
                    System.out.println("회원 가입이 완료되었습니다. 가입을 축하드립니다");
                    break;
                case 3:
                    // 예금 출금
                    System.out.println("예금 출금");
                    //로그인이 된 상태에서만 들어갈 수 있게끔
                    System.out.print("예금 ");
                    //숫자입력
                    String moneysave = scanner.nextLine();
                    
                    System.out.print("출금 ");
                    String moneyPocket = scanner.nextLine();
                    
                    //로그인이 안되었다면
                    System.out.println("로그인을 해주셔야 이용이 가능합니다");
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close(); // Scanner 
}
    
}