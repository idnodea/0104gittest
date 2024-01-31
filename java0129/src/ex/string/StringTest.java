package ex.string;

public class StringTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //1번
//		String str = ""; //2번,3번
		
		long time1 = System.currentTimeMillis(); 
		for (int i = 0; i <100000; i ++) {
			sb.append("a"); //1번  연산시간:4msec
//			str += "a"; //2번  연산시간:649msec
//			str = str.concat("a");  //3번 연산시간:662msec

		}
		long time2 = System.currentTimeMillis();
		System.out.println("연산시간:" + (time2-time1) + "msec"); 
	}

}   //String보다는 StringBuilder를 쓰자.  
