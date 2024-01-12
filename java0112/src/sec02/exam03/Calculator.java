package sec02.exam03;

//p260 혼자공

//private 
public class Calculator {   //외부호출
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = this.plus(x,y);  //this. 추가   //내부호출 중복성을 줄이고 일관성
		double result = sum/2;			//this는 필드,메소드o 호출용  생성자x
		return result;
	}
	
	void execute() {  
		double result = avg(7,10); 		//내부 호출
		this.println("실행결과"+result);			//내부 호출   //this 추가
		
	}
	void println(String message) {
		System.out.println(message);
	}
	
	
}
