package sec01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		//제네릭 활용
		List<String> list = new ArrayList<String>();
		
		//add활용
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
//자바 7부터 다이아몬드 연산자(< >)에서 타입을 추론할 수 있도록 지원되었습니다.
//따라서 ArrayList 객체를 생성할 때는 타입 매개변수를 생략할 수 있습니다. 
//이렇게 하면 코드가 간결해지고 가독성이 향상됩니다.
//타입을 명시적으로 작성하지 않아도 컴파일러가 타입을 추론할 수 있습니다.
//따라서 코드의 의도는 명확하게 전달되고 있으며, 이로 인해 코드의 유연성이 높아집니다.
//따라서 List<>list = new ArrayList<>();는 
//자바 7부터 지원되는 다이아몬드 연산자를 사용하여 코드를 더 간결하고 명확하게 만든 것입니다.

