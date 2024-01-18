package javaproject01;

import java.util.Scanner;

public class Account01Ex {
    private String name;
    private String id;
    private int pass;
    private int tel;
    private int birth;
    private int balance; // Corrected the variable name

    // Constructor
    public void Account(String name, String id, int pass, int tel, int birth, int balance) {
//        super();
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.tel = tel;
        this.birth = birth;
        this.balance = balance; // Corrected the variable name
    }

    // toString method
    @Override
    public String toString() {
        return "Account [name=" + name + ", id=" + id + ", pass=" + pass + ", tel=" + tel + ", birth=" + birth
                + ", balance=" + balance + "]";
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
