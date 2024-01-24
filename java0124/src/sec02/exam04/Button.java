package sec02.exam04;

public class Button {
	OnClickListener listener; //인터페이스 타입 필드
	
	
	void setOnClickListener(OnClickListener listener) {
		this.listener =listener;
	}  //매개변수의 다형성
	
	void touch() {
		listener.onClick();  //구현객체의 onClick()메소드호출
	}
	
	static interface OnClickListener{  //중첩 인터페이스
		void onClick();  
	}
}
