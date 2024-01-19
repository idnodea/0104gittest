package java0119ex;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상메소드의 실체메소드
	public void turnOff() {
		System.out.println("끈다");
	}
	
	//setVolume() 추상메소드의 실체메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 tv볼륨:"+this.volume); //인터페이스 상수를 이용해서 volume 필드의 값을 제한
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
}
