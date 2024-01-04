/* package sec02exam01;

import java.util.Scanner;

public class Login {
     
	//성명
	public static void CheckName(Scanner scan){
		
		while(true) {
			System.out.print("이름을 입력하세요:");
			String name = scan.nextLine();
		}if() {
			
		}else{
			System.out.println("이름입력완료.");
			break;
		}
	}
	//주민등록번호
	public static void numB(Scanner scan) {
		int ju1 =0;
		int ju2 =0;
		
		
		if(ju1=0;) {
			System.out.print("주민번호 앞 6자리: ");
	        ju1 = scan.nextInt();
	        
	        else {
	        	System.out.print("주민번호 뒤 7자리: ")
	        	ju2 = scan.nextInt();
	        	else { 만약 주민번호 뒷자리가 1,2,3,4가 아니라면 통과하지 못하게끔
	        		
	        	}
	        	break;  //이후 종료
	        	
	        }
		}
	}
	//전화번호
	public static void numC(Scanner scan) {
		int jun1 = 0;
		int jun2 = 0;
		int jun3 = 0;
		
		if(jun1) {
			//조건이 010일 때 통과하고  아니면 다시 입력
			
			
		} else if(jun2>10000){
			//조건이 9999를 넘지 않을 때 통과하고 아니면 다시 입력
			
		} else(jun>3>10000){
			//조건이 9999를 넘지 않을 때 통과하고 아니면 다시 입력
			
		}
	}
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.printf("아이디:"+"\n");   //위의 클래스와 중복오류가 일어나지 않게끔 클래스 변경
				String name.Scanner.nextLine();
				System.out.prinf("비밀번호:")
				String password.Scanner.nextLine();
				
					if(name.equals("java")) {
						if(password == 12345) {
					 System.out.println("로그인 성공");
						} else {
					 System.out.println("로그인 실패:패스워드가 틀림");
						}
					 	} else {
					 System.out.println("로그인 실패:아이디 존재하지 않음");
					 	}
					
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				String name;
		        int num1;
		        String tel1;

		        Scanner scan = new Scanner(System.in);

		        System.out.print("이름: ");
		        checkName();

		        System.out.print("주민번호 앞 6자리: ");
		        numB();

		        System.out.print("전화번호: ");
		        numC();

		        System.out.println("\n[입력한 내용]");
		        System.out.println(name + " " + num1);
		        System.out.println(tel1);
				
				
				
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
}
*/