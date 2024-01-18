package javaproject01;

public class Session {
	
	private boolean run;
	private boolean run2;      
	private boolean run3;      
	private LoginInfo loginInfo;
	private MenuState menuState = MenuState.TOP;
	
	public LoginInfo getLoginInfo() {
		return loginInfo;
	}
	
	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;}
//	}
//	//TOP,DEPOSIT, TOP_EXIT, DEPOSIT_EXIT  상태지정
//	public void setMenuState(MenuState menuState) {
//		if(menuState == MenuState.DEPOSIT) {
//			run2 = true;
//		}else if(menuState == MenuState.TOP_EXIT) {
//			run =false;
//			
//		}else if(menuState == MenuState.DEPOSIT_EXIT) {
//			run2=false;
//		}
//		this.menuState = menuState;
//	}
	//콘스트럭터 유징 필드
	public Session(boolean run, boolean run2, boolean run3, javaproject01.LoginInfo loginInfo, MenuState menuState) {
		super();
		this.run = run;
		this.run2 = run2;
		this.run3 = run3;
		this.loginInfo = loginInfo;
		this.menuState = menuState;
	}
	
	
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

	public boolean isRun3() {
		return run3;
	}

	public void setRun3(boolean run3) {
		this.run3 = run3;
	}

	public MenuState getMenuState() {
		return menuState;
	}

		//투스트링
//	@Override
//	public String toString() {
//		return "Session [run=" + run + ", run2=" + run2 + ", run3=" + run3 + ", loginInfo=" + loginInfo + ", menuState="
//				+ menuState + "]";
//	}
//	
	
	
}
