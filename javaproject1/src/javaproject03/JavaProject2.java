package javaproject03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javaproject01.Account;

public class JavaProject2 {

	public static int deposit(boolean loginStatus, boolean run2, 
			                      Scanner scanner, int balance) {
		if (loginStatus) {  // 로그인 여부
			run2 = true;
		} else {
			System.out.println("로그인 하시기 바랍니다.");
		}
		Account acc = null;
		while (run2) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum2 = Integer.parseInt(scanner.nextLine());
			switch (menuNum2) {
			case 1:
				System.out.print("예금액> ");
				acc.balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				acc.balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(acc.balance);
				break;
			case 4:
				run2 = false;
				break;
			}
			System.out.println();
		}
		return acc.balance;

	}
	
	public static void displayMember(String memberName, String memberSSN, 
			                                             String memberTel) {
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + memberName);
		System.out.println("2. 주민번호 앞 6자리: " + memberSSN); 
		System.out.println("3. 전화번호: " + memberTel);
	}
	
	public static String input(String comment, Scanner scanner) {
		System.out.print(comment); 
		return scanner.nextLine();
	}
	
	public static int question2(Scanner scanner) {
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
		} while(true);
	}
	
	public static int question(Scanner scanner) {
		int status = 0;
		do {
			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
			String answer = scanner.nextLine();
			if (answer.equals("n") || answer.equals("N")) {
				status = 1;
				return status;
			} else if (answer.equals("y") || answer.equals("Y")) {
				status = 2;
				return status;
			}
		} while(true);
	}
	
	public static void menu() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.회원출력 | 5.회원등록 | 6. 종료");
		System.out.println("-------------------------------------");
		System.out.print("선택> ");
	}
	
	public static int login(boolean membershipStatus, boolean loginStatus, 
			              Scanner scanner, String memberName, String memberSSN) {
		int status = 0; // 초기화
		if (!membershipStatus) {
			status = 1;
			System.out.println("회원 가입을 하시기 바랍니다.");
			return status;
		}
		if (loginStatus) {  // 로그인 여부 확인
			status = 2;
			System.out.println("이미 로그인 상태입니다.");
			return status;
		}
		System.out.print("아이디:");  //출력문
		String name = scanner.nextLine(); // name 변수의 값 입력
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();//패스워드입력
		if (name.equals(memberName)) {
			if (strPassword.equals(memberSSN)) {
				status = 3;
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		return status;
	}
	
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		String memberName = "";
		String memberSSN = "";
		String memberTel = "";
		int balance = 0;
		boolean loginStatus = false; // 로그인 여부
		boolean membershipStatus = false; // 회원가입 여부
		
		boolean run = true;
		boolean run2 = false;
		while (run) {
			menu();
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
				case 1:  // 회원 가입이 필요한 상태
				case 2:  // 이미 로그인한 상태
					continue;
				case 3:  // 로그인 성공 상태
					loginStatus = true;
					break;
				}
				break;
			case 2:
				if (membershipStatus) {
					System.out.println("이미 회원 가입을 하셨습니다.");
					System.out.println("회원이름:"+memberName);
					switch (question2(scanner)) {
					case 1:
						run = true;
						continue;
					case 2:
						break;
					
					}
				}
								
				memberName = input("[필수 정보 입력]\n1. 이름: ", scanner);
				memberSSN = input("2. 주민번호 앞 6자리: ", scanner); 
				memberTel = input("3. 전화번호: ", scanner);
				
				displayMember(memberName, memberSSN, memberTel);
				membershipStatus = true;
				loginStatus = false;
				break;
			case 3:
				balance = deposit(loginStatus, run2, scanner, balance);
				break;
			case 4:
				System.out.println("회원출력");
				for (Account account : list) {
					System.out.println(account);
				}
			case 5:
				System.out.println("회원등록");
				System.out.print("이름:");
				String name = scanner.nextLine();
				System.out.print("아이디:");
				String id = scanner.nextLine();
				System.out.print("패스워드:");
				String pass = scanner.nextLine();
				System.out.print("전화번호:");
				String tel = scanner.nextLine();
				System.out.print("생년월일:");
				String ssn = scanner.nextLine();
				list.add(new Account(name, id, pass, tel, ssn));
				break;	
			case 6:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}