package sec02exam01;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /* [필수 정보 입력]
        1.이름 :
        2. 주민번호 앞 6자리:
        3.전화번호:

        [입력한 내용]
        홍길동 124567
        010-555-5555
        */

        String name;
        int num1;
        String tel1;

        Scanner scan = new Scanner(System.in);

        System.out.print("이름: ");
        name = scan.next();

        System.out.print("주민번호 앞 6자리: ");
        num1 = scan.nextInt();

        System.out.print("전화번호: ");
        tel1 = scan.next();

        System.out.println("\n[입력한 내용]");
        System.out.println(name + " " + num1);
        System.out.println(tel1);
    }
}