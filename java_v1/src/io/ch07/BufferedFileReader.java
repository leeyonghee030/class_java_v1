package io.ch07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {

    public static void main(String[] args) {
        //기반 스트림 - 대상은 파일

        FileReader fr =null;
        BufferedReader br = null;
        try {
            fr = new FileReader("assets/a.txt");
            //보조 스트림 - 기반 스트림을 감싸야한다.
            br =new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 닫을떄는 역순으로 닫아 주어야 한다
                if (br != null) {
                    br.close();
                }
                if (fr != null){
                fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
