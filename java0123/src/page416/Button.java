package page416;

public class Button {
	
	OnClickListener listener;  //인터페이스타입필드
	
	void setOnClickListene(OnClickListener listener){
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();   
	}
}
