package chap7.prob4;

public class Ex {
	
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
//		controller.setService(new Service());  //오류
		controller.setService(new MemberService());  //오류
		controller.setService(new AService());  //오류
		controller.setService(new BService());  //오류
//		controller.setService(new BoardService());  //오류
//		controller.setService(new DService());  //오류
		
		
		
//		controller.setService(new Service());
		
		
	}
}
