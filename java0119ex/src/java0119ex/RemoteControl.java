package java0119ex;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	//추상메소드 선언
	//setVolume(int volume); setVolume 메소드만 int 매개값필요
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
