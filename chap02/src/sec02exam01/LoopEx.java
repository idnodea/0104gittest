package sec02exam01;

public class LoopEx {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			System.out.println("-------");
		}
		int k =0;
		/*for(;k<10;) {
			
			System.out.println("k:"+k);
			k++;
		} */
		
		for(;;) {
			if(k>=10) {
				
				break;
			}
			System.out.println("k값:"+k);
			k++;
		}
		
		
		int i=0;   //초기화
		while(i<10) {
//			System.out.println(i);   
//			i++;                    //0~9
			
			i++;
			System.out.println(i);  //0~10
			System.out.println("-------");
		}
		System.out.println("-------");
		
		int j=0;
		do{
			System.out.println(j);
			j++;
			System.out.println("-------");
		} while (j<10);
		
	}

}
