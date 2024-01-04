package sec03.exam01;

import java.util.Scanner;//

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inputData;
		
		while(true) {
			System.out.println("입력>");
			inputData = scan.nextLine();
			System.out.printf("입력된 문자열: %s\n",inputData); //엔터를 치면 엔터 키값을 제외한 것
			System.out.println(inputData.equals("q"));
			if(inputData.equals("q")) {
				//입력된 문자열이 q이면
				break; //반복문을 빠져나감
			}
		}
		System.out.println("종료");
	}

}
