package sec01.exam01;

public class NFEex {
	public static void main(String[] args) {
		
		
		try {
			int x =Integer.parseInt("aa");
			System.out.println(x);
		}catch(NumberFormatException e1){
//			System.out.println(e1.getMessage());
			System.out.println("숫자 변환 불가");
		}
	}
}
