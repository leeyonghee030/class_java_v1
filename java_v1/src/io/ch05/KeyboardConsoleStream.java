package io.ch05;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class KeyboardConsoleStream {

    public static void main(String[] args) {

//        Scanner 구현해보기
//        System.out.println(); 구현해보기

        //표준 스트림 --3개 InputStream -> System.in
        //표준 스트림 + InputStreamReader
        try (InputStreamReader reader = new InputStreamReader(System.in)) {
//            System.out.println(); -->
            PrintWriter writer = new PrintWriter(System.out,true);
            // autoFlush true로 하든 close를 해야한다.

            System.out.print("텍스트를 입력하세요 :");

            int charCode;
            while ((charCode = reader.read()) != '\n'){
                writer.print((char)charCode);
            }
            writer.flush();
            //강제로 버퍼에 남은 데이터를 즉시출력
            //autoFlush true만 하면 될떄도있고 안될때도있네

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

}
