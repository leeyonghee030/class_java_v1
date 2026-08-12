package io.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) {

        String data = "Hello, Java FileOutputStream...";
        //실행하는순간 파일이 만들어진다
//        new FileOutputStream("assets/c.txt");

        //기존 파일에 있는 데이터에 덮어쓰지말고 추가 append :true일때
//        new FileOutputStream("assets/c.txt",true);
        FileOutputStream fos = null;
        //파일객체x 생성
        try {
            fos = new FileOutputStream("assets/c.txt", true);
            fos.write(65);
            fos.write(data.getBytes());

            //변기에 물을 내리다. ?
            //단 fos.close() 메서드를 호출하면  자동으로 flush()-->close()
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
