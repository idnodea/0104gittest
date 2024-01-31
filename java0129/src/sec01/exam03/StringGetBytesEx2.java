package sec01.exam03;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx2 {
	public static void main(String[]args) {
		String str = "안녕하세요abc";
		String nstr = str.replace("abc","감사합니다");  //안녕하세요감사합니다
		System.out.println(nstr);
		//String객체의 문자열은 변경불가능 replece()메소드가 리턴하는 문자열은 
		//원래문자열의 수정본이 아닌 완전히 새로운 문자열
		
		System.out.println(str.length()); //8
		int index = "안녕하세요abc".indexOf("가요"); //없는말이라면 -1리턴
//		int index = "안녕하세요abc".indexOf("세요"); //3
		System.out.println(index);
		index = "안녕하세요abc".indexOf("세요");  //3
		System.out.println(index);
		
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+ bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 - >String:"+ str1);
		
		try {
			byte[] bytes2 =str.getBytes("EUC-KR");
			System.out.println("bytes2.length:"+bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String:"+str2);
			
			byte[]bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length:"+bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String:"+str3);
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
