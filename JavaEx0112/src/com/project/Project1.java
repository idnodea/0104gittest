package com.project;

import java.util.Scanner;

public class Project1 {
	//입력값 받아올 걸 생각하고
	static Scanner scanner = new Scanner(System.in);
	//스캐너를 활용할 수 있게 해주는 ctrl+shift+o  유틸스캐너추가
	
	public static void mainDp1() {
		System.out.println("----------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("----------------------------------");
		
	}
	 public static void mainDp2() {
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("----------------------------------");
		
	}
	static void menu2(Session session) {
		while(session.isRun2()) {
			mainDp2();
			System.out.println("선택:");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch(menuNum) {
				case 1:
					//예금
					System.out.println("예금");
					break;
				case 2:
					//출금
					System.out.println("출금");
					break;
				case 3:
					//잔고
					System.out.println("잔고");
					break;
				case 4:
					session.setMenuState(MenuState.DEPOSIT_EXIT);
					System.out.println("상위메뉴");
					break;
				
			}
		}
	}
	 
	 
	 
	static void menu1(Session session){
//		boolean run = true;		
		while(session.isRun()) {
			mainDp1();
			System.out.println("선택>");
			int menuNum=Integer.parseInt(scanner.nextLine());
			switch(menuNum){
				case 1:
					//로그인
					System.out.println("로그인처린");
					break;
					
				case 2:
					//회원가입
					System.out.println("회원가입");
					break;
				case 3:
					//예금 출금
					System.out.println("예금 출금"); //로그인상태라면
					if(session.getLoginInfo() !=null) {
						session.setMenuState(MenuState.DEPOSIT);
						menu2(session);
					}
					break;
				case 4:
					//종료
				session.setMenuState(MenuState.TOP_EXIT);
					System.out.println("프로그램 종료");
					break;
					
			}		
		}
	}
	
	
	
	 public static void main(String[] args){
		 LoginInfo loginInfo = new LoginInfo("id","pass"); 
		 Session session = new Session(true, false, loginInfo);
		 menu1(session); 
	 }
	
}
