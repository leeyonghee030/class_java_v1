package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TypingRecord3 {

    public static void main(String[] args) {

        //키보드에서 값을 입력 받아서 내가 정의한 파일에 그대로 저장 시키는 기능
        Scanner sc = new Scanner(System.in);
        System.out.println("---타자 연습 기록기---");
        System.out.println("1. 문자 저장");
        System.out.println("2. 기록 보기");
        System.out.print("선택 : ");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            saveRecode(sc);
        } else if (choice.equals("2")) {
            printRecode();
        }



        sc.close();
    }



    public static  void printRecode() {
        System.out.println("\n 저장된 기록");
        try (FileInputStream fis = new FileInputStream("C:\\Users\\이용희\\Desktop\\study\\work_space\\java_class_1\\java_v1\\assets\\typing.txt")) {
            int data;
            while ((data = fis.read()) != -1){
                System.out.print((char)data);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void saveRecode(Scanner sc) {
        try (FileOutputStream fos = new FileOutputStream("assets/typing.txt")) {
            System.out.print("연습한 문장을 입력하세요 : ");
            String recode = sc.nextLine();
            LocalTime now = LocalTime.now();

            fos.write(recode.getBytes());
            fos.write("\n".getBytes());

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


