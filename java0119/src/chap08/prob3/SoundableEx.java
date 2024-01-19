package chap08.prob3;

class Cat implements Soundable{  

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "냥";
	}
	
}

class Dog implements Soundable{
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍";
	}
	
}

public class SoundableEx {   //퍼블릭은 하나만

	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound());
	}
	
	public static void main(String[]args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
