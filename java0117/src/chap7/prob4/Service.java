package chap7.prob4;

public class Service {
	
	public  void Login() {
		System.out.println("로그인");
	}
	public class MemberService extends Service{
		public void login() {
			System.out.println("멤버로그인");
		}
	}
	public class AService extends MemberService{
		public void login() {
			System.out.println("A로그인");
		}
	}
	
	
}
