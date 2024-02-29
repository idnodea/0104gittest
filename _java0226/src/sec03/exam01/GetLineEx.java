package sec03.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class GetLineEx {

	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
		
		//둘 중 하나인데,  이경우 변수가 문자열이므로 리더
		//BufferedInputStream br = new BufferedInputStream(reader);
//		BufferedReader br = new BufferedReader(reader);
	
		Scanner br = new Scanner(System.in);
		while(true) {
			System.out.println("입력하세요: ");
			//String linestr = br.readLine();
			
			//String linestr = br.readLine(); 스캐너로 바꾼다면
			String lineStr = br.nextLine();
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				break;
			}
			System.out.println("입력된 내용:" + lineStr);
		}
		System.out.println("종료합니다.");
		br.close();
	}
	
	

}
