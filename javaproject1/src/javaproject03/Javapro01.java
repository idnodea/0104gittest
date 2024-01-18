//package javaproject03;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import javaproject01.Account;
//
//public class Javapro01 {
//
//    static boolean run1 = true; // Moved run1 to a class variable
//    static boolean run2 = true; // Moved run2 to a class variable
//    
//    
//    //회원가입2
//	public static int question(Scanner scanner) {
//		int status = 0;
//		do {
//			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
//			String answer = scanner.nextLine();
//			if (answer.equals("n") || answer.equals("N")) {
//				status = 1;
//				return status;
//			} else if (answer.equals("y") || answer.equals("Y")) {
//				status = 2;
//				return status;
//			}
//		} while(true);
//	}
//	
//    
//    //회원가입
//	public static int question2(Scanner scanner) {
//		int status = 0;
//		do {
//			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
//			String answer = scanner.nextLine();
//			switch (answer) {
//			case "n":
//			case "N":
//				status = 1;
//				return status;
//			case "y":
//			case "Y":
//				status = 2;
//				return status;
//			}
//		} while(true);
//	}
//	//로그인
//
//	public static int login(boolean membershipStatus, boolean loginStatus, 
//			              Scanner scanner, String memberName, String memberSSN) {
//		int status = 0; // 초기화
//		if (!membershipStatus) {
//			status = 1;
//			System.out.println("회원 가입을 하시기 바랍니다.");
//			return status;
//		}
//		if (loginStatus) {  // 로그인 여부 확인
//			status = 2;
//			System.out.println("이미 로그인 상태입니다.");
//			return status;
//		}
//		System.out.print("아이디:");  //출력문
//		String name = scanner.nextLine(); // name 변수의 값 입력
//		System.out.print("패스워드:");
//		String strPassword = scanner.nextLine();//패스워드입력
//		if (name.equals(memberName)) {
//			if (strPassword.equals(memberSSN)) {
//				status = 3;
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("로그인 실패:패스워드가 틀림");
//			}
//		} else {
//			System.out.println("로그인 실패:아이디 존재하지 않음");
//		}
//		return status;
//	}
//	
//    
//    //예출금작동
//	public static int deposit(boolean loginStatus, boolean run3, Scanner scanner, int balance) {
//		if (loginStatus) { // 로그인 여부
//			run3 = true;
//		} else {
//			System.out.println("로그인 하시기 바랍니다.");
//		}
//		Account acc = null;
//		while (run2) {
//			System.out.println("-------------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("-------------------------------------");
//			System.out.print("선택> ");
//			int menuNum2 = Integer.parseInt(scanner.nextLine());
//			switch (menuNum2) {
//			case 1:
//				System.out.print("예금액> ");
//				acc.balance += Integer.parseInt(scanner.nextLine());
//				break;
//			case 2:
//				System.out.print("출금액> ");
//				acc.balance -= Integer.parseInt(scanner.nextLine());
//				break;
//			case 3:
//				System.out.print("잔고> ");
//				System.out.println(acc.balance);
//				break;
//			case 4:
//				run2 = false;
//				break;
//			}
//			System.out.println();
//		}
//		return acc.balance;
//
//	}
//    
//	
//	
//    //예금출금화면
//    public static void disMain2() {
//        System.out.println("-----------------------------------------");
//        System.out.println("1.예금 |" + "2.출금 |" + "3.잔고 |" + "4.상위메뉴");
//        System.out.println("-----------------------------------------");
//    }
//    //첫번째 화면
//    public static void disMain() {
//        System.out.println("-----------------------------------------");
//        System.out.println("1.회원출력 |" + "2.회원등록 |" + "3.로그인 |"+ "4.파일저장 |" + "5.파일읽기 |" + "6.종료");
//        System.out.println("-----------------------------------------");
//    }
//    
//    
//    
//    public static void main2() {
//        Scanner scanner = new Scanner(System.in);
//        disMain2();
//        System.out.println("선택:");
//        while (run2) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//            switch (numIn) {
//                case 1:
//                    System.out.println("1.예금");
//                    break;
//                case 2:
//                    System.out.println("2.출금");
//                    break;
//                case 3:
//                    System.out.println("3.잔고");
//                    break;
//                case 4:
//                    System.out.println("4.예금메뉴종료");
//                    run2 = false; // Corrected variable name
//                    break;
//            }
//        }
//        System.out.println("종료");
//    }
//
//    public static void main1() {
//    	List<Account> list = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        disMain();
//        boolean run1 = true;
//        System.out.println("선택:");
//        while (run1) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//            switch (numIn) {
//                case 1:
//                	System.out.println("회원출력");
//    				for (Account account : list) {
//    					System.out.println(account);
//    				}
//                    break;
//                case 2:
//                	System.out.println("회원등록");
//    				System.out.print("이름:");
//    				String name = scanner.nextLine();
//    				System.out.print("아이디:");
//    				String id = scanner.nextLine();
//    				System.out.print("패스워드:");
//    				String pass = scanner.nextLine();
//    				System.out.print("전화번호:");
//    				String tel = scanner.nextLine();
//    				System.out.print("생년월일:");
//    				String ssn = scanner.nextLine();
//    				list.add(new Account(name, id, pass, tel, ssn));
//                    break;
//                case 3:
//                    System.out.println("3.로그인");
//                    break;
//                case 4:
//                    System.out.println("4.파일읽기");
//                    break;
//                case 5:
//                    System.out.println("5.파일저장");
//                    break;
//                case 6:
//                    System.out.println("6.종료");
//                    run1 = false; // Corrected variable name
//                    break;
//            }
//        }
//        System.out.println("종료");
//    }
//
//    public static void StartMenu() {
//        Scanner scanner = new Scanner(System.in);
//        LoginInfo loginInfo = new LoginInfo("id","pass"); 
////        Session session = new Session(true, false, loginInfo);
//        disMain();
//        main1();
//        String memberName = "";
//		String memberSSN = "";
//		String memberTel = "";
//		int balance = 0;
//		boolean loginStatus = false; // 로그인 여부
//		boolean membershipStatus = false; // 회원가입 여부
//		boolean run3 = true;
//		boolean run4 = false;
//		while (run3) {
//			main1();
//			int menuNum = Integer.parseInt(scanner.nextLine());
//			switch (menuNum) {
//			case 1:
//				switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
//				case 1: // 회원 가입이 필요한 상태
//				case 2: // 이미 로그인한 상태
//					continue;
//				case 3: // 로그인 성공 상태
//					loginStatus = true;
//					break;
//				}
//				break;
//			case 2:
//				if (membershipStatus) {
//					System.out.println("이미 회원 가입을 하셨습니다.");
//					System.out.println("회원이름:" + name);
//					switch (question2(scanner)) {
//					case 1:
//						run3 = true;
//						continue;
//					case 2:
//						break;
//
//					}
//				}
//
//				
//				displayMember(name, pass, ssn, balance);
//				membershipStatus = true;
//				loginStatus = false;
//				break;
//			case 3:
//				balance = deposit(loginStatus, run2, scanner, balance);
//				break;
//			case 4:
//				run3 = false;
//				break;
//			}
//		}
//    }
//
//    public static void BalanceMenu(String[] args) {
//    	Scanner scanner = new Scanner(System.in);
//    	disMain2();
//        main2();
//    }
//}