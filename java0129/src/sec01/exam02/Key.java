package sec01.exam02;

import java.util.Objects;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}


	@Override 
	public boolean equals(Object obj) { //매개변수의 다형성(Object로부터 상속)
		if (obj instanceof Key) { //Key클래스의 객체인가?
			Key compareKey = (Key) obj; //Key클래스 변수에 대입
			if(this.number == compareKey.number) { //number 비교하려고 
				return true;
			}
		}
		return false;
	 }  //null을 바꾸기 위해

	//해쉬코드만 재정의하면?
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return number;   //변경
	}
		

}
