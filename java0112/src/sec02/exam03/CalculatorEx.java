package sec02.exam03;
//p260 혼자공
public class CalculatorEx {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();//외부호출
		myCalc.plus(0,0); //외부호출
	}
}    //내부호출  외부호출
