package com.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] arr = {"김사랑", "김하나", "김두울", "김세엣"};
		String[] arr2 = arr;//복사 아님 , 주소만 복사한것임
		String[] newArr = new String[arr.length];
		
		for (String str:newArr) {
			System.out.println(str);
		}
		//우리책 p195배열 복사
//		System.arraycopy(arr, 0, newArr, 0, newArr.length);
						//복사대상 0번째부터, 복사대상 0번째부터.  길이만큼
		
		System.arraycopy(arr, 0, newArr, 0, arr.length);
						//복사대상 0번째부터, 복사대상 0번째부터.  길이만큼
		for(String str: newArr) {
			System.out.println(str);
		}
		//더 좋아진 배열 복사
		String[] newArr1 = Arrays.copyOf(arr, arr.length);
		for(String str: newArr1) {
			System.out.println(str);
		}
	}

}
