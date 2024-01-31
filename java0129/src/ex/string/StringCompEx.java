package ex.string;

public class StringCompEx {

	public static void main(String[] args) {
		String str1 = "aBc";
		String str2 = "Abc";
		
		System.out.println(str1.toLowerCase()); //전부소문자
		System.out.println(str2.toUpperCase()); //전부대문자
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("같다");
		}
	}

}
