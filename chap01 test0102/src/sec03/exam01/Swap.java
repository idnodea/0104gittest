package sec03.exam01;

public class Swap {

	public static void main(String[] args) {
		//자료교환(swap)
		int x = 10;
		int y = 20;
		int a = 0;
		//x ->y, y->x
		//System.out.printf("x는 +%d, y는 %d\n", x , y );  //포맷 형태  프린트하고 한줄내린다  포맷을 맞추고 프린트한다
		/*int temp = x;  
		x = y ;
		y = temp; */
		
		a = x;
		x = y;
	    y = a;
		
		
		System.out.printf("x는 +%d, y는 %d\n", x , y );
	}

}
