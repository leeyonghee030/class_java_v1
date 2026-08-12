package io.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

    public static void main(String[] args) {
        //파일을 1바이트씩 읽어 들이는 스트림
        FileInputStream in = null;

        int readDate;

        try {
            in = new FileInputStream("assets/a.txt");
            //파일의 첫 번쟤 데이터를 한 바이트로 읽기
            readDate = in.read();
            System.out.println("1 : " + readDate);
            System.out.println("1 : " + (char) readDate);

            //파일의 두 번쨰 데이터를 한 바이트로 읽기
            readDate = in.read();
            System.out.println("2 : " + readDate);
            System.out.println("2 : " + (char) readDate);

            //도전과제 - 반복정인 부분 확인 하고 끝까지 파일에서 데이터를
            //읽는 코드를 작성해주세요
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
