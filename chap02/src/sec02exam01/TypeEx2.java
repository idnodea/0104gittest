package sec02exam01;

public class TypeEx2 {

	public static void main(String[] args) {
		// p86 확인문제 type
		//1번 문제
//		byte byteValue = 10;
//		char charValue = 'A';
		
//		int intValue = byteValue;
// 		int intValue2 = charValue;   
//		short shortValue = charValue;   //오류  short 3만~3만 단 음수가능, char 6만5천정도
//		double doubleValue = byteValue;
		
		//2번문제
//		int intValue = 10;
//		char charValue = 'a';
//		double doubleValue = 5.7;
//		String strValue = "A";     //대문자로 시작,클래스타입
		
//		double var = (double)intValue;
//		byte var2 = (byte)intValue;
//		int var3 =(int)doubleValue;
//		char var4= (char)strValue;  //오류

		//3번 문제
//		byte byteValue = 10;
//		float floatValue = 2.5F;
//		double doubleValue = 2.5;
//		
//		byte result = byteValue + byteValue;  결과가 int 로 바뀌므로 자동 타입변환 안됨
//		int result2 =5+byteValue;
//		float result3 = 5+floatValue;
//		double result4 = 5+doubleValue;
		
		//4번 문제
//		short s1 = 1;
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		short result =(s1+s2);  //결과가 int로 바뀌므로 자동 타입변환안됨  (short)이런식으로는 가능
//		int result2 = i1 +i2;
		
		//5번 문제
//		char c1 = 'a';
//		char c2 = /*강제형변환하면 된다(char)*/ (c1 + 1);  문자+숫자 int로 변환됨
//		System.out.println(c2);
		
		//6번 문제
//		int x =5;
//		int y =2;
//		String result = x/y + "";   double 
//		 
//		System.out.println(result);
		
		//7번 문제   2.5가 나오게  두 네모에 넣을것
//		int x = 5;
//		int y = 2;
////	double result = x/(double)y;
		
//		System.out.println(result);
		
		//8번 문제  두 실수 덧셈연산 소수점 이하 자리 버리기
//		double var1 =3.5;
//		double var2 =2.7;
//		int result = (int) (var1+var2);
//		System.out.println(result);
		
		//9번
		long var11 = 2L;
		float var21 = 1.8f;
		double var31 = 2.5;
		String var41 = "3.9";
		int result9 = (int) ( (int) var11 + var21 +var31) + (int) Double.parseDouble(var41);
		System.out.println(result9);
		
		//10번
//		5 23 23
		
//		//11번
//		byte value = ("10");
//		int value = ("1000");
//		float value = ("20.5");
//		double value = ("3.14159");
		
		
	}

}
