package com.roj;

public class ContinueEx {

	public static void main(String[] args) {
		ba: for(int i =0; i<100; i++) {  // 레이블
			for(int j = 0; j<100; j++) {
				if(i == 3 && j == 3) {
					continue ba;
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}
		
		
	}

}
