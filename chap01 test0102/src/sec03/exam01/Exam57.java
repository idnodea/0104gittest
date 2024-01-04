package sec03.exam01;

public class Exam57 {
//	intx = 100
//	메인메 them드를 벗어나서 코딩하는 건 안됨
	public static void main(String[] args) {
		int v1 = 0;
		if (true) {
			int v2 = 0;
			if(true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}//v1 = v2 + v3;  
			/*v1(main) v2(main-if- v3 /main-if /if x -x 0     v1= v2  v3*/
		}
		System.out.println(v1);
			//v1(main)  v2(main
		
	}
	
}
