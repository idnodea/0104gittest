//0130 5교시

package sec01.exam22;

public class Boxing {

	public static void main(String[] args) {
//		Integer num1 = new Integer(3);
//		Integer num2 = new Integer(3);
		Integer num1 = 128; //127로 하면 트루(범위 내)
		Integer num2 = 128;
		System.out.println(num1 == num2);
		System.out.println(num1.equals(num2));
		
		
		int x = 100;
//		String str = new String("가나다");
		String str = "가나다";
		
		//박싱
//		Integer obj1 = 300;   //자동박싱
		Integer obj1 = new Integer(300);
//		Integer obj2 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("100");
		System.out.println(obj1);
		
		//	Integer obj1 = new Integer("100");
		
		//언박싱
		int y = obj1.intValue();
		System.out.println(y);
		int z = x + obj1;
		System.out.println(z);
		
		System.out.println( x == obj2);
		System.out.println( x != obj1);
		
		
	}
}
