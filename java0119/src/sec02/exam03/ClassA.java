package sec02.exam03;

interface InterA{   //조부
	void method();
}

class ClassB implements InterA{   //부모

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

public class ClassA extends ClassB{  //자식
	public static void main(String [] args) {
		InterA ita = new ClassA();
	}
}
