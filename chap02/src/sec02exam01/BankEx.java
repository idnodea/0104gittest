package sec02exam01;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private String name;
    private String ssn;
    private String phoneNumber;
    private double balance;

    public BankAccount(String name, String ssn, String phoneNumber) {
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("예금이 성공적으로 완료되었습니다. 현재 잔액: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금이 성공적으로 완료되었습니다. 현재 잔액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("현재 잔액: " + balance);
    }
}

class BankSystem {
    private Map<String, BankAccount> accounts;
    private Scanner scanner;

    public BankSystem() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void register() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("주민번호 앞 6자리를 입력하세요: ");
        String ssn = scanner.next();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.next();

        BankAccount account = new BankAccount(name, ssn, phoneNumber);
        accounts.put(ssn, account);

        System.out.println("회원가입이 완료되었습니다.");
    }

    public void login() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("주민번호 앞 6자리를 입력하세요: ");
        String ssn = scanner.next();

        BankAccount account = accounts.get(ssn);
        if (account != null && account.getName().equals(name)) {
            System.out.println("로그인이 성공적으로 완료되었습니다.");
            showMenu(account);
        } else {
            System.out.println("일치하는 회원 정보가 없습니다.");
        }
    }

    private void showMenu(BankAccount account) {
        while (true) {
            System.out.println("\n1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
            System.out.print("원하는 기능을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("예금할 금액을 입력하세요: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 회원가입 | 2. 로그인 | 3. 종료");
            System.out.print("원하는 기능을 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankSystem.register();
                    break;
                case 2:
                    bankSystem.login();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
