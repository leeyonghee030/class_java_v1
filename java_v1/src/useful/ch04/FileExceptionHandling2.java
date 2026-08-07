package useful.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileExceptionHandling2 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        //여기 파일이 있는지 확인 할떄

        try {
            fis = new FileInputStream("test1.txt"); //파일이 있으면 가져옴
            //메모리 누수가 됨 반드시 안쓸떄 닫아야함

            byte[] data = fis.readAllBytes(); //파일 전체를 읽어 온다
            String content = new String(data, StandardCharsets.UTF_8);
            //읽은 값을 문자열로 변환

            System.out.println("파일 내용 시작 ");
            System.out.println(content);
            System.out.println("파일 내용 끝 ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는 도중 문제가 발생됨");
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
