package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SecretNote2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("비밀 메모장");
        System.out.println("1. 비밀메모 적기");
        System.out.println("2. 비밀메모 보기");
        System.out.print(" 선택 :");
        String choice = sc.nextLine();
        if (choice.equals("1")) {
            fosSecretNote(sc);
        } else if (choice.equals("2")) {
            fisSecretNote();
        } else {
            System.out.println("다시 입력해주세요");
        }






        sc.close();
    }

    public static void fisSecretNote() {
        System.out.println("저장된 메모장");
        System.out.println("--비밀 문구--");
        int data;
        try (FileInputStream fis = new FileInputStream("assets/secret.txt")) {

            System.out.println("해독 문구");
            while ((data = fis.read()) != -1) {
                System.out.print((char)(data - 3));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void fosSecretNote(Scanner sc) {
        System.out.println("--비밀 메모장--");
        System.out.print("저장할 메모를 입력하세요 : ");

        String input = sc.nextLine();

        byte[] original = input.getBytes();
        byte[] encrypted = new byte[original.length];

        try (FileOutputStream fos = new FileOutputStream("assets/secret.txt")) {

            for (int i = 0; i < input.length(); i++) {
                encrypted[i] = (byte) (original[i] + 3);
            }
            fos.write(encrypted);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
