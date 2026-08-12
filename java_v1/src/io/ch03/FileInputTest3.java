package io.ch03;

import java.io.FileInputStream;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest3 {

    public static void main(String[] args) {
        //in.read(byte[] b)
        // 데이터를 담아둘 그릇을 미리 만들어 둔다.
        //크디 10 = 한에 최대 10 바이트 까지 읽오겠다 라고 설정함

        byte[] bufeer = new byte[255];

        //read(byte[])는 읽은 바이트 수를 반환 합니다
        // read()가 바이트 값 자체를 돌려주는 것 과는 다르다

        LocalTime now = LocalTime.now();
        int readcount;
        try (FileInputStream in = new FileInputStream("assets/a.txt")) {
            while ((readcount = in.read(bufeer)) != -1) {
                //buffer.lenth ..
                for (int i = 0; i < readcount; i ++) {
                    System.out.print((char) bufeer[i]);
                }
                System.out.println();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //close() 자동호출됨
        LocalTime end = LocalTime.now();
        Duration work = Duration.between(now, end);
        System.out.println(work.toMillis() * 0.001 + "초");

    }
}
