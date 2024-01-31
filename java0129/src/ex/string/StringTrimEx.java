package ex.string;

public class StringTrimEx {

	public static void main(String[] args) {
		String str = "  가나 다     ";
		System.out.println(str.length());
		System.out.println(str.trim().length());
	
		String str1 = String.valueOf(10);
		System.out.println(str1+30);
		
		String ss = 2+"";
		System.out.println(ss);
	}

}
