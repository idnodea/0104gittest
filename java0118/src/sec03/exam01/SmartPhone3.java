package sec03.exam01;

public class SmartPhone3 extends SmartPhone{  
									//앱스트렉트를 이어받아서 추상메서드를
									//사용하면 앱스트렉트속성이 있어야겠지만
									//없다면 아래에서 오류를 해결하기 위한
									//오버라이드가 진행한다
									//abstract를 빼버리면 추상삭제되고

	public SmartPhone3(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	} //abstract-abstract-x
									//생성자를 만들어라 //부모 부모의 부모 모두 생성자 있으니까.
	//abstract불가능..

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String ring(int tel) {
		// TODO Auto-generated method stub
		return null;
	}
				//위에 abstract를 제거한 후, 추상삭제되서 오류를 해결하기 위해 
				//여기서 소스-임플리먼트를 이어받게 된다.	
	
	
	//그러면 왜 소스 임플리먼트냐.   동물들 소리가 나면 sound라는 형식을 유지한채로 내용만
	//형식 문법을 유지한 채로,(다형성) 내용을 바꿔서 사용하기 위함.  객체지향
	
}
