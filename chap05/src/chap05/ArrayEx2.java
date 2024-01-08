package chap05;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		//int[] sct = {8, 11, 13};  리터널 이므로 값을 받아놓고 시작
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 정수배열의 개수:");
		int num = scan.nextInt();
		int[] sct = new int[num];
		//int[] sct = new int [3]; //힙 영역 생성 개수   0 1 2
		//String[] names = new String[5];
		
		sct[0] = 8;
		sct[0] = 11;
		sct[0] = 13;
		
		System.out.println(sct[0]);
		System.out.println(sct[1]);
		System.out.println(sct[2]);
		//System.out.println(sct[3]);
		
		for(int i=0; i <sct.length; i++) {
			System.out.println(sct[i]);
		}       //위 3줄과 같다
		
		String str = "abc";
		System.out.println(str.length());  //문자 하나저장
		
		
		String [] nds = new String[5];     //문자 여럿  한묶음으로 하나저장
		nds[0] = str;
		nds[1]  = "김하나";
		nds[2]  = "하나";
		for (int i = 0; i<nds.length; i++) {
			System.out.println(nds[i]);
		}
		
	}

}
