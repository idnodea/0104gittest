package sec01.exam01;

import java.util.ArrayList;
import java.util.List;



public class ArrayListEx {   //p558
	public static void main(String[] args) {
		
		String[] strArr = new String[100]; //개수 고정형  고정배열,속도빠름
//원형	
		ArrayList<String> list = new ArrayList<String>(); //가변
		//어레이리스트라고 읽음. 문자열을 가변적인 배열로
//축약형	
//		List<String> list = new ArrayList<>;
		list.add("홍길동");
		list.add("홍성동");
		list.add("홍흥동");
		for(String str : list) {
			System.out.println(str);
		}
		list.set(1, "박하나");   //0,1,2   흥성동을 박하나로
		for(String str : list) {
			System.out.println(str);
		}
	}
}
