package sec01.exam01;

public class MemberEx {

	public static void main(String[]args) {
		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
		Member obj2 = new Member("BLUE"); //대문자-멤버클래스에서 재정의
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());//멤버에서 투스트링추가
		
//		System.out.println(obj1);  //해쉬코드
//		System.out.println(obj2);
//		System.out.println(obj3);
//		System.out.println(obj1); 
//		System.out.println(obj1.hashCode());

		System.out.println(obj1.hashCode()); 
		////멤버에서 이거대신	return id.hashCode();
	    // 이걸로 바꿔줌 return id.toLowerCase().hashCode();
		//그럼 해쉬코드값도 같이 나옴
		System.out.println(obj2.hashCode()); 
		System.out.println(obj3.hashCode());
		
		
		if(obj1.equals(obj2)) {
			System.out.println("같다");  
			//Member클래스작성후 같다
		}else {
			System.out.println("다르다"); //다르다처음엔
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다"); //다르다
		}
	}
}
//해쉬코드값이 같고, 이콜즈까지 같으면 같은 객체 Member