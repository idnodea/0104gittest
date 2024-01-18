//챗GPT수정본2 Account LoginInfo MenuState Session2 고려한 수정
package javaproject01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javapro04 {

    List<Account> list = new ArrayList<>();
    Account depositAccount;
    LoginInfo loginInfo = new LoginInfo(null, null);
    boolean run1 = true;
    boolean run2 = true;
    boolean run3 = false;

    public void displayMember(String memberName, String memberSSN, String memberTel) {
        System.out.println();
        System.out.println("[입력된 내용]");
        System.out.println("1. 이름: " + memberName);
        System.out.println("2. 주민번호 앞 6자리: " + memberSSN);
        System.out.println("3. 전화번호: " + memberTel);
    }

    public void disMain2() {
        System.out.println("--------------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
        System.out.println("--------------------------------------");
    }

    public void disMain() {
        System.out.println("-----------------------------------------");
        System.out.println("1.회원출력 | 2.회원등록 | 3.로그인 | 4.파일저장 | 5.파일읽기 | 6.종료");
        System.out.println("-----------------------------------------");
    }

    public int login(boolean membershipStatus, boolean loginStatus, Scanner scanner, String memberName,
            String memberSSN) {
        int status = 0;
        if (!membershipStatus) {
            status = 1;
            System.out.println("회원 가입을 하시기 바랍니다.");
            return status;
        }
        if (loginStatus) {
            status = 2;
            System.out.println("이미 로그인 상태입니다.");
            return status;
        }
        System.out.print("아이디:");
        String name = scanner.nextLine();
        System.out.print("패스워드:");
        String strPassword = scanner.nextLine();
        if (name.equals(memberName)) {
            if (strPassword.equals(memberSSN)) {
                status = 3;
                System.out.println("로그인 성공");
                loginInfo.setId(name);
                loginInfo.setPass(strPassword);
            } else {
                System.out.println("로그인 실패:패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패:아이디 존재하지 않음");
        }
        return status;
    }

    public int question2(Scanner scanner) {
        int status = 0;
        do {
            System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
            String answer = scanner.nextLine();
            switch (answer) {
                case "n":
                case "N":
                    status = 1;
                    return status;
                case "y":
                case "Y":
                    status = 2;
                    return status;
            }
        } while (true);
    }

    public int question(Scanner scanner) {
        int status = 0;
        do {
            System.out.println("가입절차를 계속 진행하실래요?(Y/N)");
            String answer = scanner.nextLine();
            if (answer.equals("n") || answer.equals("N")) {
                status = -1;
                return status;
            } else if (answer.equals("y") || answer.equals("Y")) {
                status = 2;
                return status;
            }
        } while (true);
    }

    public void main2() {
        if (run3) {
            if (loginInfo.getId() != null) {
                Scanner scanner = new Scanner(System.in);
                disMain2();
                System.out.println("선택:");

                depositAccount = new Account("이름", "아이디", "패스워드", "전화번호", "생년월일");

                while (run2) {
                    int numIn = Integer.parseInt(scanner.nextLine());

                    switch (numIn) {
                        case 1:
                            System.out.println("1.예금");
                            depositAccount.deposit(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 2:
                            System.out.println("2.출금");
                            depositAccount.withdraw(Integer.parseInt(scanner.nextLine()));
                            System.out.println("잔고: " + depositAccount.getBalance());
                            break;
                        case 3:
                            System.out.println("3.잔고");
                            System.out.println("잔고: " + depositAccount.getBalance());
                            break;
                        case 4:
                            run2 = false;
                            break;
                    }
                }
                System.out.println("4.예금메뉴종료");
            } else {
                System.out.println("로그인 하시기 바랍니다.");
            }
        } else {
            System.out.println("회원가입을 진행하시기 바랍니다.");
        }
    }

    public void main1() {
        Scanner scanner = new Scanner(System.in);

        String memberName = "";
        String memberSSN = "";
        String memberTel = "";
        boolean loginStatus = false;
        boolean membershipStatus = false;

        disMain();
        System.out.println("선택:");

        while (run1) {
            int numIn = Integer.parseInt(scanner.nextLine());

            switch (numIn) {
                case 1:
                    switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
                        case 1:
                        case 2:
                            System.out.println("1.회원출력");
                            for (Account account : list) {
                                System.out.println(account);
                            }
                            break;
                        case 3:
                            if (membershipStatus) {
                                System.out.println("이미 회원 가입을 하셨습니다.");
                                System.out.println("회원이름:" + memberName);
                                switch (question2(scanner)) {
                                    case 1:
                                        run1 = true;
                                        continue;
                                    case 2:
                                        break;
                                }
                            }

                            memberName = input("[필수 정보 입력]\n1. 이름: ", scanner);
                            memberSSN = input("2. 주민번호 앞 6자리: ", scanner);
                            memberTel = input("3. 전화번호: ", scanner);

                            displayMember(memberName, memberSSN, memberTel);
                            list.add(new Account(memberName, "아이디", "패스워드", memberTel, memberSSN));
                            membershipStatus = true;
                            run3 = true;
                            loginStatus = false;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("3.파일저장");
                    break;
                case 4:
                    System.out.println("4.파일읽기");
                    break;
                case 5:
                    System.out.println("5.종료");
                    run1 = false;
                    break;
            }
        }
        System.out.println("종료");
    }

    private String input(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public void StartMenu() {
        disMain();
        main1();
    }

    public static void main(String[] args) {
        Javapro04 javapro04 = new Javapro04();
        javapro04.StartMenu();
        javapro04.main2();
    }
}