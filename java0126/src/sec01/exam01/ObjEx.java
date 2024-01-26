//0126 1교시
package sec01.exam01;

public class ObjEx {

	public static void main(String[] args) {
		String str =  "가나다";
		String str1 = "가나다";
		System.out.println(str == str1);//메모리주소값비교:true
		
		String str3 =  new String ("가나다");//새로운 객체생성
		String str4 =  new String ("가나다");//각각 다른객체
		System.out.println(str3 == str4);//false/주소를비교
		System.out.println(str3.equals(str4));//true /값만비교
		// == 주소를 비교하고, equal은 값을 비교한다
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		System.out.println(result); //false
		
		boolean result2 = (obj1 == obj2);
		System.out.println(result2); //false
	}

}
