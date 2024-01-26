package sec01.exam01;

public class AIOOBEex {
	public static void main(String[] args) {
		
		try {
			String str = args[0];
			String str1 = args[1];
			System.out.println("str");
			System.out.println("str1");
		
		} catch(ArrayIndexOutOfBoundsException e1){//오류내용복사
//			e.printStackTrace();
			System.out.println(e1.getMessage());
			System.out.println("예외발생");
		}
		
		
//		String str = args[0];
//		String str1 = args[1];
//		System.out.println("str");
//		System.out.println("str1");
	}
	//run 컴피귤레이션
	//(x) 아규먼트
	//아무거나 치면
	//두번째까지 (띄어쓰기)넣어줘야 오류x
}
