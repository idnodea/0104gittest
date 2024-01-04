package sec02exam01;

public class OperaorEx {

	public static void main(String[] args) {
		System.out.println(0.1 == 0.1f);  //double  float 서로 타입이 다르다보니   -p120
		System.out.println((float)0.1 == 0.1f);  
		System.out.println(0.1 == (double)0.1);  
		System.out.println(3 == 3.0);
		System.out.println('A'== 65);     
		System.out.println("----");
		int bn = 'B' - 'A';
		System.out.println(bn);
		System.out.println("----");
		
		boolean b1 = 65<66;
		boolean b2 = 'A'<'B';
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("----");
		
		String str1 = "JDK"+6.0; //JDK6.0
		String str2 = "JDK"+3+3.0; 
		String str3="JDK"+(3+3.0);
		System.out.println(str3);
		System.out.println("----");
		
		for(int i =0; i<10; i++) {
			char c1 = (char) ('A'+i);
			System.out.println(c1);
			
		}
		System.out.println("----");
		char c1 = 'A'+1;
		System.out.println(c1);
		System.out.println("----");
		
		for(int i =1; i<10; i++) {
			if(i % 2 ==0) { //2의 배수
				System.out.println(i);
			}
		}
		
		
		System.out.println("----");
		
		int num = 10 % 3;  //10을 3으로 나누고 남은 나머지 //1
		System.out.println(num);
		
		boolean play=true;
		System.out.println(!play);
		
		
		
		
		
		//byte b = 100;
		//byte result = -b;  //-1*b  (연산결과가 정수)
		byte b = 100+10;
		int result = -b;  //-1*b  (연산결과가 정수)
		
		int x = 1;
		int y = 1;
		int result1 = ++x +10;   //x에 1만큼 증가 이경우엔 12
		System.out.println(result1);
		int result2 = y++ +10;   //  이 경우 11
		System.out.println(result2);
		
		System.out.println("x:"+x+", y:"+y);
		
		
		
	}

}
