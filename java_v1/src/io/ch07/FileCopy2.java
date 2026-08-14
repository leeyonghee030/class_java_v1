package io.ch07;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;

public class FileCopy2 {


    public static void main(String[] args) {

        //파일을 읽어와서 데이터를 저장한다
//        byte[] buffer = new byte[8000];
        int data;
         LocalTime start = LocalTime.now();

        try (FileInputStream fis = new FileInputStream("assets/employees.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("assets/employees2.zip");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {

            while ((data = bis.read()) != -1) {
                    bos.write(data);
                    //buffer = 물을 담는 양동이
                //read(buffer) = 수도꼭지에서 물을 받아 양동이를 채우는 행위
                //count = 이번에 양동이에 몇 리터 받았는지 알려주는 숫자
            }
            System.out.println("파일 복사 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalTime end = LocalTime.now();
        Duration work = Duration.between(start,end);
        System.out.println("복사시간 : " +work.toMillis() * 0.001 + "초");

    }
}
