package javaproject01;

public class Account {
    private String name;
    private String id;
    private String pass;
    private String tel;
    private String ssn;
    public int balance;

    public Account(String name, String id, String pass, String tel, String ssn) {
        super();
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.tel = tel;
        this.ssn = ssn;
    }

    // 추가: 예금 메소드
    public void deposit(int deposit) {
        if (deposit <= 0) {
            System.out.println("금액을 정확히 입력하세요.");
            return;
        }
        balance += deposit;
    }

    // 추가: 출금 메소드
    public void withdraw(int withdraw) {
        if (withdraw > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        if (withdraw <= 0) {
            System.out.println("0원 및 마이너스단위는 출금하실 수 없습니다.");
            return;
        }
        balance -= withdraw;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", id=" + id + ", pass=" + pass + ", tel=" + tel + ", ssn=" + ssn
                + ", balance=" + balance + "]";
    }
}