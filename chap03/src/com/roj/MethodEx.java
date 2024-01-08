package com.roj;

public class MethodEx {

	public static /*void*/ String input() { //선언부분
		String str = "aaa";
		return str;  //return과 위에 있는 void는 병립x
		
	}
	
	public static void input(String[] args) {
		// TODO Auto-generated method stub
		//input();
		String str = input();  //호출  -실행
		System.out.println(input());
	}

}
