package chap05;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int [6]; // 인덱스 0-5 (갯수는 6개)
		Random rand = new Random();
		lotto[0] = rand.nextInt();
/*		lotto[1] = rand.nextInt();
		lotto[2] = rand.nextInt();
		lotto[3] = rand.nextInt();
		lotto[4] = rand.nextInt();
		lotto[5] = rand.nextInt();    */
		
		//반ㅂㄱ문으로 변경
		for(int i =0; i <lotto.length; i++) {
			lotto[i] = rand.nextInt(10)+1;  //0~9 +1  ~> 1qnxj
			System.out.println(lotto[i]);
		}
		System.out.println("-----------");
		for(int val : lotto) {
			System.out.println(val);  
			
		}
		
	}

}
