package com.project;

public class Session {
	private boolean run;  //메뉴1
	private boolean run2; //메뉴2
	private LoginInfo LoginInfo;
//	Account account;
	private MenuState menuState = MenuState.TOP;
	
	//게터세터
	public LoginInfo getLoginInfo() {
		return LoginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		LoginInfo = loginInfo;
	}

	public MenuState getMenuState() {
		return menuState;
	}

	public void setMenuState(MenuState menuState) {
		if(menuState == MenuState.DEPOSIT) {
			run2 = true;
		}else if(menuState == MenuState.TOP_EXIT) {
			run = false;
		}else if(menuState == MenuState.DEPOSIT_EXIT) {
			run2 = false;
		}
		this.menuState = menuState;
	}
	

	//컨스트럭터 유징 필드
	public Session(boolean run, boolean run2, com.project.LoginInfo loginInfo, MenuState menuState) {
		super();
		this.run = run;
		this.run2 = run2;
		LoginInfo = loginInfo;
//		this.menuState = menuState;
	}
	
//	투스트링 일단 사용x
//	@Override
//	public String toString() {
//		return "Session [run=" + run + ", run2=" + run2 + ", LoginInfo=" + LoginInfo + ", menuState=" + menuState + "]";
//	}
	
	
	//게터세터에서 일정부분
	public boolean isRun() {
		return run;
	}
	
	public void setRun(boolean run) {
		this.run = run;
	}
	public boolean isRun2() {
		return run2;
	}
	public void setRun2(boolean run2) {
		this.run2 = run2;
	}
//	public LoginInfo getLoginInfo() {
//		return LoginInfo;
//	}
//	public void setLoginInfo(LoginInfo loginInfo) {
//		LoginInfo = loginInfo;
//	}
//	public MenuState getMenuState() {
//		return menuState;
//	}
//	public void setMenuState(MenuState menuState) {
//		this.menuState = menuState;
//	}  
	
	
	
}
