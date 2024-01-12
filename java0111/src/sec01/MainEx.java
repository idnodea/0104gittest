package sec01;

public class MainEx {

	public static void main(String[] ar) {
		if(ar.length !=2) {
			System.out.println("값의 수가 부족");
			System.out.println("시스템 종료");
			System.exit(0);   //끝낸다 시스템엑싯(0) 0은 정상종료를 뜻한다.
								//시스템 종료 전 시그널(신호)를 주고 종료함
			
		}
		String str = ar[0];
//		System.out.println(args[0]);
		System.out.println(str);
	}

}		//런 컨피규레이션
