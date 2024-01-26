//변수의 사용범위
package sec01;

public class VaroableEx3 {

	public static void main(String[] args) {
		int v1= 15;
		if(v1>10) {
			int v2;
			v2 = v1 -10;
		}
//		int v3 = v1 +v2+5;  //v2변수를 사용할 수 없기 때문에 컴파일 에러 발생
		
//		int sum;
//		int score1=0;
//		int score2;
//		sum = score1+score2; //오류  score2가 초기화되지 않았음으로  
	}
	
}
