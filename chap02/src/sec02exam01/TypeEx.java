package sec02exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str3 ="3.14";
		double value = Double.parseDouble(str3);
		
		
		
		String str2 =""+ 10 + 2; //문자열로 만들기
		System.out.println(str2);
		
		int num1 = Integer.parseInt(str2);
		System.out.println(num1);
		
//		String str   //다른 타입들로 인해 만들어진
		String str = 10+2+"";  //아래와 같은 효과   계산후 
		System.out.println(str);
		String str1 = String.valueOf(10+2);   //문자열로 바꿔준다 -정석!
		System.out.println(str1);
		
		System.out.println(1.0/2.0); //
		
		int x = 1;
		int y=2;
//		double result2 = x/y;
		double result2 = x/ (double) y;
		System.out.println(result2);  //소수점이 아니라 0?
		
//		byte result = 10 +20;
//		System.out.println(result);
		byte value1 = 10;
		int value2 = 100;
		//byte sum = value1 + value2;
		int sum2 = value1 + value2;
//		int sum3 = (byte) value1 + value2;
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue);
		System.out.println(result);
		
		
		
		
		byte var1 = 100; //byte var1 = 129; xx
		int var2 = var1;  //자동타입변환
		long var3 = 100000000000L;
		float var4 = var3;
		System.out.println(var4);
		
		var1 = (byte) var2;
		System.out.println(var1);
//		var1 = var2;
		
		
		
	}

}
