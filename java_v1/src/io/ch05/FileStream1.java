package io.ch05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream1 {

    public static void main(String[] args) {
        writeToFile("w1.txt");
        readFromFile("w1");

    }

    //파일 텍스트를 쓰는 메서드 (문자 기반 스트림 사용)
    public static void writeToFile(String filename) {

        //Read / Write
        try (FileWriter fw = new FileWriter("assets/" + filename)) {
            String test = "자바 문자 기반 스트림 예제\n";
            fw.write(test);
            fw.write("추가 문자열을 기록합니다");

            System.out.println("파일 텍스트를 잘 기록했습니다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFromFile(String filename) {

        try (FileReader fileReader = new FileReader("assets/" + filename + ".txt")) {
            int charCode;

            while ((charCode = fileReader.read()) != -1) {
                System.out.print((char)charCode);
                //한글이 깨지지않지만 똑같이 반환값이 int 형변환
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
