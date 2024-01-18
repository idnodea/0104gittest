package javaproject03;

public class LoginInfo {
    private String id;
    private String pass;

    // 추가: 생성자
    public LoginInfo(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "LoginInfo [id=" + id + ", pass=" + pass + "]";
    }

    // 추가: 게터 및 세터
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}