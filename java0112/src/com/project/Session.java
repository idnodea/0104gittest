//20241012 3교시
package com.project;

//실행 상태의 정보를
public class Session {
	private boolean run;
	private boolean run2;      //private추가
	private LoginInfo loginInfo;
	private	MenuState menuState = MenuState.TOP; //필드 추가   //상수
	
	
	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	//메뉴스테이트를 소스-게터세터
	public MenuState getMenuState() {
		return menuState;
	}

	public void setMenuState(MenuState menuState) {
		if(menuState == MenuState.DEPOSIT) {
			run2 = true;
		}else if(menuState == MenuState.TOP_EXIT) {
			run=false;
			
		}else if (menuState == MenuState.DEPOSIT_EXIT) {
			run2 =false;
		}
		this.menuState = menuState;
	}

	//콘스트럭쳐 유징 필드
	public Session(boolean run, boolean run2, LoginInfo loginInfo) {
		super();
		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	//using field
	public Session(boolean run, boolean run2) {
		super();
		this.run = run;
		this.run2 = run2;
	}




//  to String
//	@Override
//	public String toString() {
//		return "Session [run=" + run + ", run2=" + run2 + "]";
//	}
//	
	
	
	
	//게터세터
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
	
	//source  겟터셉터
	
}
