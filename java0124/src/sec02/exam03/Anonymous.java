package sec02.exam03;

public class Anonymous {
	RemoteControl field = new RemoteControl(){
		//add uiimple
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켜다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끄다");
		}
		
	};

	void method1() {
//		RemoteControl localVar;
//		localVar.turnOn();  //지역변수 꼭? 초기화?
							//메소드실행할 때
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("audio를 켜다");	
			}
			
			@Override
			public void turnOff() {
				System.out.println("audio를 끄다");
			}
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	

}
