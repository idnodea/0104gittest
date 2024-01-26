//0126 2교시 프로그램종료exit()
package sec01.exam01;

public class ExitEx {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				
				System.exit(0);
				//break;
			}
		}
		System.out.println("마무리코드");
	}

}
