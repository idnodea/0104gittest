package sec02exam01;

public class IntergerLiteralExample {

	public static void main(String[] args) {
		byte var1 = -128;
//		byte var2 = -129;
		byte var2 = 127;
//		byte var4 = 128;
//		short var5 = -32767;
		short var3 = -32767;
		short var4 = 32767;
//		char
//		int
//		long
		
		int var7 = 0b01; //2진수  0B01;
//		System.out.println(var7);
		int var8 = -0b1111111; //2진수  0B01;
//		System.out.println(var8);
		
		int var9 = 0206;    //8진수
		int var10 = 365;    //10진수
		
		int var11 = 0xf;  //0x16  0xb3 16진수
//		System.out.println(var11);  //16진수
		
		long var12 = 2150000000L;
//		long var14 = 2150000000;
		int var13 = 2100000000;
		
		char var15 = '가';
//		System.out.println(var15);
//		char var16 = "a";
		
		/*  2진수는 대입하고자 하는 값 앞에 0b를 붙인다. (숫자0과 영문자b)

			8진수는 대입하고자 하는 값 앞에 0 을 붙인다. (숫자0)

			16진수는 대입하고자 하는 값 앞에 0x 를 붙인다. (숫자0과 영문자x)
			
			122는
			2진수로 1111010
			8진수로 172
			16진수로 7A 이다.
			
		 */
		char var16 = 'a';
		char var18 = '\uac00';
		int var17 = '각';
		System.out.println(var16);
		System.out.println(var18);
		System.out.println(var17);
		
		String str = "가나다";
		System.out.println(str);
		String str2 = "가\"나\"\\다"; //String str2 = "가""나"다"; //String str2 = "가\"나\"다";
		System.out.println(str2);
		
		/*지수 가수*/		
//		float var20 = 0.25;
		float var21 = 0.25f;
		double var22 = 0.25;
		double var23 = 5e5;
		System.out.println(var22);

		double var24 = 1.8e307;
		System.out.println(var24);
		
	}

}
