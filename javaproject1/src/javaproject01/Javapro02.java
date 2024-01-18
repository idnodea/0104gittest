//
//
//package javaproject01;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Javapro02 {
//	
//	List<Account> list = new ArrayList<>();
//	
//	
//    static boolean run1 = true;
//    static boolean run2 = true;
////    static int deposit = null;
//    
//    
//    
//    
//    //세번째 회원가입 화면
//    public static void displayMember(String memberName, String memberSSN, 
//            String memberTel) {
//    	System.out.println();
//    	System.out.println("[입력된 내용]");
//    	System.out.println("1. 이름: " + memberName);
//    	System.out.println("2. 주민번호 앞 6자리: " + memberSSN); 
//    	System.out.println("3. 전화번호: " + memberTel);
//}
//    
//    
//    //두번째 (예금출금)화면
//    public static void disMain2() {
//        System.out.println("--------------------------------------");
//        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
//        System.out.println("--------------------------------------");
//    }
//    
//    //첫번째화면
//    public static void disMain() {
//        System.out.println("-----------------------------------------");
//        System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 | 5.종료");
//        System.out.println("-----------------------------------------");
//    }
//    //로그인
//	public static int login(boolean membershipStatus, boolean loginStatus, Scanner scanner, String memberName,
//			String memberSSN) {
//		int status = 0; // 초기화
//		if (!membershipStatus) {
//			status = 1;
//			System.out.println("회원 가입을 하시기 바랍니다.");
//			return status;
//		}
//		if (loginStatus) { // 로그인 여부 확인
//			status = 2;
//			System.out.println("이미 로그인 상태입니다.");
//			return status;
//		}
//		System.out.print("아이디:"); // 출력문
//		String name = scanner.nextLine(); // name 변수의 값 입력
//		System.out.print("패스워드:");
//		String strPassword = scanner.nextLine();// 패스워드입력
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
//    //회원정보가입절차2
//    public static int question2(Scanner scanner) {
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
//	
//    
//    //회원정보가입
//    public static int question(Scanner scanner) {
//    	int status =0;
//    	do {
//    		System.out.println("가입절차를 계속 진행하실래요?(Y/N)");
//    		String answer = scanner.nextLine();
//    		if(answer.equals("n") || answer.equals("N")) {
//    			status = -1;
//    			return status;
//    		} else if (answer.equals("y") || answer.equals("Y")) {
//				status = 2;
//				return status;
//    		}
//    	} while(true);
//    }
//    
//    
//    
//    
//    //예금출금 동작	
//    public static void main2() {
//    	
//    	if (run2 == true) {  // 로그인 여부
//			
//		} else {
//			System.out.println("로그인 하시기 바랍니다.");
//		}
//    	
//    	
//        Scanner scanner = new Scanner(System.in);
//        disMain2();
//        System.out.println("선택:");
//        
//  
//      Account deposit = new Account;
//        
//        while (run2) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//            
//            
//            
//            
//            switch (numIn) {
//                case 1:
//                    System.out.println("1.예금");
//                    deposit.balance += Integer.parseInt(scanner.nextLine());
//                    break;
//                case 2:
//                    System.out.println("2.출금");
//                    deposit.balance -= Integer.parseInt(scanner.nextLine());
//                    System.out.println(deposit.balance);
//                    break;
//                case 3:
//                    System.out.println("3.잔고");
//                    System.out.println(deposit.balance);
//                    break;
//                case 4:
//                    
//                    run2 = false;
//                    break;
//            }
//        }
//        System.out.println("4.예금메뉴종료");
//    }
//
//    //첫번째 화면 동작
//    public static void main1() {
//        Scanner scanner = new Scanner(System.in);
//        
//        String memberName = "";
//		String memberSSN = "";
//		String memberTel = "";
//		boolean loginStatus = false; // 로그인 여부
//		boolean membershipStatus = false; // 회원가입 여부
//		
//		
//        disMain();
//        System.out.println("선택:");
//        
//        
//        
//        while (run1) {
//            int numIn = Integer.parseInt(scanner.nextLine());
//
//            switch (numIn) {
//                case 1:
//                	switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
//    				case 1:  // 회원 가입이 필요한 상태
//    				case 2:  // 이미 로그인한 상태
//                    System.out.println("1.회원출력");
////                    LoginArray();
////                    for(Account2 account2 : list) {
////                    	System.out.println(account2);
////                    }
//                    break;
//    				case 2:
//    					if (membershipStatus) {
//    						System.out.println("이미 회원 가입을 하셨습니다.");
//    						System.out.println("회원이름:"+memberName);
//    						switch (question2(scanner)) {
//    						case 1:
//    							run1 = true;
//    							continue;
//    						case 2:
//    							break;
//    						
//    						}
//    					}
//    									
//    					memberName = input("[필수 정보 입력]\n1. 이름: ", scanner);
//    					memberSSN = input("2. 주민번호 앞 6자리: ", scanner); 
//    					memberTel = input("3. 전화번호: ", scanner);
//    					
//    					displayMember(memberName, memberSSN, memberTel);
//    					membershipStatus = true;
//    					loginStatus = false;
//    					break;
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
//    
//    ////////////////////////
//    
//    
//    public static void StartMenu() {
//        Scanner scanner = new Scanner(System.in);
//        disMain();
//        main1();
//        // LoginInfo loginInfo = new LoginInfo();
//        Session Ss1 = new Session(false, false);
//    }
//
//    public static void main(String[] args) {
//        StartMenu();
//    }
//}