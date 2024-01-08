package com.roj;

public class BreackEx {

	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i == 55) {  
				//System.out.println(i);
//				break;  //루프를 빠져나옵니다  탈출->거기까지 실행하고 탈출x  그전까지만 실행하고 탈출o
				continue;  //55번은 건너뜀
			}
			System.out.println(i); //문제? 숫자 몇을 출력할까요? 54
		}
		System.out.println("종료");   //break는 탈출 continue는 해당반복문 탈출
		//System.out.println(i);   
	}

}
