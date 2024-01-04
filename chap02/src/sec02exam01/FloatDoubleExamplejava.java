package sec02exam01;

public class FloatDoubleExamplejava {

	public static void main(String[] args) {
		float num1 = 123.456755684654657645432263f;
		double num2 = 123.456755684654657645432263f;
		
		System.out.println("float형 변수 num1 : "+ num1);
		System.out.println("double형 변수 num1 : "+ num2);
		
		double var = 0.1;
		for(int i = 0; i < 10; i++) {  //10회 반복
			var += 0.1;
		}
		System.out.println(var);
		
		
		char var2 = 65;
		System.out.println(var2);
		char var3 = 'a'; //char var3 = 'ab';
		
		boolean var4 = false;
		
		float aaa= 1e2f;
		double value = 2e-308; //double value = 2e-350;
		
		boolean stop = false;
		if(stop) {
			System.out.println("멈춥니다.");
		}else {
			System.out.println("출발합니다");
		}
	}

}
