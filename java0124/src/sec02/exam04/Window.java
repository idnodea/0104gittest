package sec02.exam04;

public class Window {
	Button button1 =new Button();
	Button button2 =new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);; //매개값으로 필드 대입
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});  //매개값으로 익명객체 대입
	}
	
}

 
