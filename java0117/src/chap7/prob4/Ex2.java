package chap7.prob4;

public class Ex2 {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.Login();    //출력결과:로그인
		
		controller.setService(new AService());
		controller.service.Login(); 	//출력결과:로그인
		
	}

}
