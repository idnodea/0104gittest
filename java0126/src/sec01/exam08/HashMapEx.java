//0126 3교시 해쉬맵
package sec01.exam08;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		//임포트,  제네릭안에서 int등 사용불가능 Integer등으로
		Map<String, Integer> map = new HashMap<>();
		//
		map.put("김하나", 85);   //(키,밸류) 순서
//		map.put("김하나", 90);
		map.put("김하나", 90);  //키가 중복되면 리플레이스된다
		map.put("이하나", 70);
		map.put("박하나", 95);
//		System.out.println(map.get("이하나"));
		System.out.println(map.get("김하나"));
		System.out.println(map.size());
	}

}
