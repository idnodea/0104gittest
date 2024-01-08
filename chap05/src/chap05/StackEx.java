package chap05;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 32;
		//int age = null;      오류 o
		//String age2 = null;  오류 x 런타임
		String name = "강하나";
		String gi = "";  //       =/ null
		String ni = null;   //  =  null
		
		String sd = null;
		sd = "가나다";    //
		System.out.println(sd);;    //   
		//String sd2 = null;
		//sd2 = "가나다";    //
		//System.out.println(sd2);;    
		
		
		//int[] intArray = null;
		//intArray[0] = 10;
		//String str = null;
		//String str2 = "kang";
		//String str3 =  new String ("가나다");
		//System.out.println(str.length());   -컴파일오류 x 런타임 o
		//System.out.println(str3.length());
		
		String name1 = "신용권";     
		String name2 = "신용권";     //리터럴   
		System.out.println(name1 == name2);  //true 주소값이 같다.
		System.out.println(name1.equals(name2));  //값도 같다
		
		String name3 =  new String ("신용권");
		String name4 =  new String ("신용권");  //리터럴
		System.out.println(name3 == name4);  //위와 다르게, 주소값이 다르다
		System.out.println(name3.equals(name4));  //값은 같다
		
		//둘 다 리터럴이지만,  위의경우 특수하므로 주소값이 같게 나온거고 
		//일반적인 리터럴로서 아래처럼 다르게 나오는 경우가 일반적임
		
		int var1 = 10;
		int var2 = 10;
		String var3 = "AB";
		String var4 = "AB";
		String var5 = new String("AB");
		
		
		//var1 == var2
		
	}

}
