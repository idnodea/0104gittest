package chap05;

import java.util.Scanner;

public class ProjectEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 학생수
				System.out.print("학생 수");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; //힙영역에 생기고 초기화
				break;
			case 2:
				// 점수
				for(int i = 0; i <scores.length; i++) {
					System.out.println("점수:"+(i+1)+" :");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
				break;
			case 3:
				// 점수리스트
				for(int i = 0; i <scores.length; i++) {
					System.out.println("점수리스트:"+(i+1)+" :"+scores[i]);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 4:
				// 분석
				int max=0, sum=0;
				double avg = 0.0;
				for(int num : scores) {
					if(max<num) {
						max=num;
					}
					sum += num;
				}
				avg = sum/ (double) studentNum;
				System.out.println("학교 최고"+max);
				System.out.println("학교 최고점"+sum);
				System.out.println("학교 최고점"+avg);
				break;
			case 5: 
				// 종료
				System.out.println("종료");
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}