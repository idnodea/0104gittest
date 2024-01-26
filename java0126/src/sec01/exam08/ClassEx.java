//0126 3교시 class객체얻기
package sec01.exam08;

class Car{}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Car.class;  //1번째 방식
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		//이미지활용   //bin폴더 안에 이미지파일넣고 실행
		//클래스경로를 활용해서 리소스 절대경로얻기
		String str=clazz.getResource("photo2.jpg").getPath();
		System.out.println(str);
		String str2=clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		
		//2번째 방식
//		Class clazz2 = Class.forName(null);
		//add throw해줘야함
		Class clazz2 = Class.forName("sec01.exam08.Car");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
	
		//3번째 방식
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
	
	}

}
