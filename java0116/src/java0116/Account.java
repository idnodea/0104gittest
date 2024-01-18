//0116 1교시
package java0116;

public class Account {
	
	private String name;
	private int balance; //은행잔고 (마이너스 통장아님)
	
	//소스-제너레이트 게터세터
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;   
	}	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
		}
		
	}
	
	
}
