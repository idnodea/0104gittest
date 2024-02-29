package prop;



public class MakeObj {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//둘 다 객체 생성 //위와 아래와 같음
//		Aaa obj = new Aaa();
//		obj.aaaprint();
		
		//문자열은 안 알려줬음
		Class<?> handlerClass = Class.forName("prop.Aaa");
        Aaa handlerInstance = 
                (Aaa) handlerClass.newInstance();
        handlerInstance.aaaprint();
	}

}
