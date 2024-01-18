package javaproject03;

public class Session {

    private boolean run;
    private boolean run2;
    private boolean run3;
    private LoginInfo loginInfo;
//    private MenuState menuState = MenuState.TOP;

    public Session(boolean run, boolean run2, boolean run3, LoginInfo loginInfo, MenuState menuState) {
        super();
        this.run = run;
        this.run2 = run2;
        this.run3 = run3;
        this.loginInfo = loginInfo;
//        this.menuState = menuState;
    }

    // 게터 및 세터 추가
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

//    public MenuState getMenuState() {
//        return menuState;
//    }
//
//    public void setMenuState(MenuState menuState) {
//        if (menuState == MenuState.DEPOSIT) {
//            run2 = true;
//        } else if (menuState == MenuState.TOP_EXIT) {
//            run = false;
//
//        } else if (menuState == MenuState.DEPOSIT_EXIT) {
//            run2 = false;
//        }
//        this.menuState = menuState;
//    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }
}