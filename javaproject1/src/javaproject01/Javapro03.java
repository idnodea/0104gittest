//import java.util.Scanner;
//
//public class Javapro03 {
//
//	static boolean run1 = true;
//    static boolean run2 = true;
//
//    // 메서드 수정
//    public static void displayMember(String memberName, String memberSSN, String memberTel) {
//        System.out.println();
//        System.out.println("[입력된 내용]");
//        System.out.println("1. 이름: " + memberName);
//        System.out.println("2. 주민번호 앞 6자리: " + memberSSN);
//        System.out.println("3. 전화번호: " + memberTel);
//    }
//
//    public static void disMain2() {
//        System.out.println("--------------------------------------");
//        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
//        System.out.println("--------------------------------------");
//    }
//
//    public static void disMain() {
//        System.out.println("-----------------------------------------");
//        System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 | 5.종료");
//        System.out.println("-----------------------------------------");
//    }
//
//    // 추가된 메서드
//    public static String input(String message, Scanner scanner) {
//        System.out.print(message);
//        return scanner.nextLine();
//    }
//
//    public static void main2() {
//        // ...
//
//        Scanner scanner = new Scanner(System.in);
//        disMain2();
//        System.out.println("선택:");
//
//        Account deposit = new Account("Name", "ID", "Pass", "Tel", "SSN");
//
//        while (run2) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//
//            switch (numIn) {
//                case 1:
//                    System.out.println("1.예금");
//                    deposit.deposit(Integer.parseInt(scanner.nextLine()));
//                    break;
//                case 2:
//                    System.out.println("2.출금");
//                    deposit.withdraw(Integer.parseInt(scanner.nextLine()));
//                    System.out.println(deposit.getBalance());
//                    break;
//                case 3:
//                    System.out.println("3.잔고");
//                    System.out.println(deposit.getBalance());
//                    break;
//                case 4:
//                    run2 = false;
//                    break;
//            }
//        }
//        System.out.println("4.예금메뉴종료");
//    }
//
//    public static void main1() {
//        // ...
//
//        while (run1) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//
//            switch (numIn) {
//                case 1:
//                    switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
//                        case 1:
//                        case 2:
//                            System.out.println("1.회원출력");
//                            break;
//                        case 3:
//                            // 로그인 성공 시 처리
//                            break;
//                    }
//                    break;
//                case 2:
//                    if (membershipStatus) {
//                        System.out.println("이미 회원 가입을 하셨습니다.");
//                        System.out.println("회원이름:" + memberName);
//                        switch (question2(scanner)) {
//                            case 1:
//                                run1 = true;
//                                continue;
//                            case 2:
//                                break;
//                        }
//                    }
//
//                    memberName = input("[필수 정보 입력]\n1. 이름: ", scanner);
//                    memberSSN = input("2. 주민번호 앞 6자리: ", scanner);
//                    memberTel = input("3. 전화번호: ", scanner);
//
//                    displayMember(memberName, memberSSN, memberTel);
//                    membershipStatus = true;
//                    loginStatus = false;
//                    break;
//                case 3:
//                    System.out.println("3.파일저장");
//                    break;
//                case 4:
//                    System.out.println("4.파일읽기");
//                    break;
//                case 5:
//                    System.out.println("5.종료");
//                    run1 = false;
//                    break;
//            }
//        }
//        System.out.println("종료");
//    }
//
//    public static void StartMenu() {
//        // ...
//
//        disMain();
//        main1();
//        // LoginInfo loginInfo = new LoginInfo();
//        Session Ss1 = new Session(false, false, false, null, MenuState.TOP);
//        selectMenu(Ss1);
//    }
//
//    public static void main(String[] args) {
//        StartMenu();
//    }
//}