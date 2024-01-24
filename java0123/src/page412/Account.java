package page412;

class Name {}    //바깥쪽으로도 가능
class School {}

public class Account {
	
//	Name name;   //null상태
	Name name = new Name();;  //객체생성->필드들도 객체생성
//	School school; //null상태
//	School school = new School(); //객체생성
    static School school = new School(); //객체생성 -바깥쪽에 클래스가 있으면 오류x
    									//이 아래 코드, 안쪽에 클래스가 있으면 오류o
    									//바깥에 선언을 하는식으로(종속)o
    									//ex)Account상태와 상관없이 사용가능하게해줌
    Account acc = new Account();		//static이라면, 그런데 
//  static School school = acc.new School();//순차적x선언하는공간 따라서 필드에선x
    
    
    
    
    
    
//	class Name {}   //안쪽에서
//	class School {}   //그렇지만 다시 안쪽으로 하는건 어카운트가 쉽게 쓸 수 있도록,노출덜되도록
}
