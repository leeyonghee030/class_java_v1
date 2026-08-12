package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;

public class FileInputTest2 {


    public static void main(String[] args) {
        //파일을 열면 반드시 닫아주는것이 좋다 하지만 반족적 코드가 매번
        //발생해서 불편함이 있다
        //이 불편함을 해곃사기 위해서 새로운 문법
        //try-with-resources 제공하고 있다
//
//        try(스트림을 생성... 자종으로 close() 호출됨) {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        LocalTime now = LocalTime.now();
        try (FileInputStream in = new FileInputStream("assets/a.txt")) {
            int readData;
            while ((readData = in.read()) != -1) {
                System.out.print((char)readData);
            }
            System.out.println();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //close() 자동호출됨
        LocalTime end = LocalTime.now();
        Duration work = Duration.between(now,end);
        System.out.println(work.toMillis() *0.001 + "초");

    }
}
