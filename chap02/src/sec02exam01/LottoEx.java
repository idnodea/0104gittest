package sec02exam01;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
//		System.out.println(Math.PI);
		
		for(int i=0; i<6; i++){
			
//			System.out.println(Math.random());  //난수발생
			//int num = (int) (Math.random()*45+1);
//			System.out.println(num);
			
		}
		//난수발생 2번
		Random rd = new Random();
		for(int i =0; i<6; i++) {
			
			System.out.println(rd.nextInt(45)+1);
//			System.out.println(rd.nextInt(10));  //0~9
//			System.out.println(rd.nextInt(10)+1);  //1~10
		}

	}

}
