package sec03.exam01;

public class Variable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;   //타입 변수이름
		//변수      //타입은 저장범위
		// 변수 이름은 명명규칙을 따른다
		//첫 번째 글자는 문자이거나 '$','_'이어야 하고 숫자로 시작할 수 없습니다(필수) ex)price, $price, _comprice (o), 1v,@spe,$&spe(x)
		//첫 문자는 영어 소문자로 시작하되, 다른 언어가 붙을 경우 첫 문자를 대문자로 합니다(관례) firstname과 firstName은 다른 변수
		//첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫문자를 대문자로 합니다(관례)
		//문자 수 길이 제한은 없음
		//자바 예약어는 사용할 수 없습니다(필수)
	
		/*예약어- 에러발생함*/
		//기본타입 boolean, byte, char, sort, int, long, float, double
		//접근 제한자 private, protected, public
		//클래스관련 class, abstract, interface, extends, implements, enum
		//객체관련 new, instanceof, this, super, null
		//메소드 관련 void, return
		//제어문 관련 if, else, switch, case, default, for, do, while, break, continue
		//논리값 true, false
		//예외 처리 관련 try, catch, finally, throw, throws
		//기타 package,import, synchronized, final, static
		
		//의미있는 이름이면서 한글없이 해주는 걸 추천
		
		/*대입연산자(=)*/
		//같다 x 자바에서는 오른쪽의 값을 왼쪽의 변수에 저장한다는 의미
		int score;   
		score = 90; //초기값  =>  // int score = 90;
		//선언과 생성은 다르다
		//변수 선언은 저장되는 값의 종류와 이름만 언급한 것
		//변수에 최초로 값이 저장될 때 변수가 생성됩니다 - 변수 초기화 , 그리고 이때 사용된 값을 초기값이라고 합니다
		
		//잘못된 예시 int value; int result = value + 10;
		//올바르게 int value = 30; int result = value + 10;
	}
}
