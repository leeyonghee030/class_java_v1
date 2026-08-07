package useful.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHanding {

    public static void main(String[] args) {

        FileInputStream fis = null;
        //여기 파일이 있는지 확인 할떄

        try {
            fis = new FileInputStream("test1.txt");
            return;
        } catch (FileNotFoundException e) {
            System.out.println("test1.txt 파일을 찾을 수 없음 ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //반드시 수행됨 return 포함
            System.out.println("finally 수행 ");
        }
        //alt + enter로 쉽게 만들수있음
    }
}
