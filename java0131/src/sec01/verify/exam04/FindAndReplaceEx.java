package sec01.verify.exam04;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String strData1="200";
		int intData1= Integer.parseInt(strData1);
		int intData2 = 150;
		String strData2 =String.valueOf(intData2);
		
		
		String str="모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바"); //위치를 정수로
		System.out.println("index:"+ index);
		if(index == -1) {
			System.out.println("자바문자열포함x");
		}else {
			System.out.println("자바문자열 포함되어 있네요");
			str = str.replace("자바", "Java"); //새로운 문자열
			System.out.println("str:" +str);
		}
	}

}
