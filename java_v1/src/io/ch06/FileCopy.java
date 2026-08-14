package io.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class FileCopy {


    public static void main(String[] args) {

        //파일을 읽어와서 데이터를 저장한다
        byte[] buffer = new byte[8000];
        int count;
         LocalTime start = LocalTime.now();

        try (FileInputStream fis = new FileInputStream("assets/img1.zip");
             FileOutputStream fos = new FileOutputStream("assets/img2.zip")) {

            while ((count = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, count);
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
