package sec02exam01;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디:");
		String name = scan.nextLine();
		
		System.out.print("패스워드");
		String strPassword = scan.nextLine();
		int password = Integer.parseInt(strPassword);
		
//		if(boolean name = true) {
//			if(boolean name = true; boolean password = true) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("로그인 실패:패스워드가 틀림");
//			}
//		}else {
//			System.out.println("로그인 실패:아이디 존재하지 않음");
//		}
		
	}

}
