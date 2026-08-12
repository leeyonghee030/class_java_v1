package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord2 {

    public static void main(String[] args) {

        int data;
        StringBuffer sb = new StringBuffer();
        LocalTime now;
        System.out.println("-----타자연습 기록기------");
        System.out.print("연습한 문장을 입력하세요 : ");

        try {

            while ((data = System.in.read()) != '\n'){
                System.out.print((char)data);
                sb.append((char)data);
            }
            System.out.println();
            now = LocalTime.now();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //도전 과제 - 입력 받은 문자열을 assets/typing.txt 파일에 바로 기록
        //도전 과제2- 파일에 한 단어를 입력할떄 소요시간도 함께표시
//
        String input = sb.toString();

        try (FileOutputStream fos = new FileOutputStream("assets/typing.txt")) {
            fos.write(input.getBytes());
            LocalTime end = LocalTime.now();
            Duration work = Duration.between(now, end);
            System.out.println(work.toMillis() * 0.001 + "초 걸림");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능
        try (FileInputStream in = new FileInputStream("assets/typing.txt")) {
            System.out.println("파일 내용읽어오기");
            while ((data = in.read()) != -1 ){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
