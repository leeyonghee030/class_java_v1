package io.ch04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord {

    public static void main(String[] args) {

        //키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능
        Scanner sc = new Scanner(System.in);

        System.out.println("-----타자연습 기록기------");
        System.out.print("연습한 문장을 입력하세요 : ");
        String input = sc.nextLine();
        LocalTime now = LocalTime.now();

        //도전 과제 - 입력 받은 문자열을 assets/typing.txt 파일에 바로 기록
        //도전 과제2- 파일에 한 단어를 입력할떄 소요시간도 함께표시

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


    }

}
