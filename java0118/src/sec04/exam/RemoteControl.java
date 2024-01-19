//0118 3교시
package sec04.exam;


//Il1
public interface RemoteControl {  //클래스대신 인터페이스로 만들어도 상관x
	public static final int Max_VOLUME = 10; //아래의 코드와 의미와 같음
	int MIN_VOLUME = 0;        //위의 코드와 의미와 같음  
								//대문자이므로 상수라는 걸 추측가능
	
//	int x;						//인터페이스에선 변수선언불가능
	int x=100;						//상수
	
	
	public void turnOn();//추상메소드활용목적
	public void turnOff();			     //아래의 코드와 의미와 같음
	public void setVolume(int volume);
}
	//클래스: 필드 생성자 메소드
	//인터페이스: 상수필드 추상메소드   특히 추상메소드   //생성자 못 가짐   