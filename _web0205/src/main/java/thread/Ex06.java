package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex06 {

    public static void main(String[] args) {
        Thread th = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    LocalDateTime localDateTime = LocalDateTime.now();
                    String localDateTimeFormat1 =
                            localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초"));
                    System.out.println(localDateTimeFormat1);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("time out");
            }
        };
        th.start();
        mainTask();
    }

    public static void mainTask() {
        System.out.println("시작");
        for (int i = 0; i < 5; i++) {
            System.out.println("진행");
            // Thread.sleep(1000); // 주석 처리하여 각 반복이 1초 간격으로 진행되도록 수정
        }
        System.out.println("끝");
    }
}