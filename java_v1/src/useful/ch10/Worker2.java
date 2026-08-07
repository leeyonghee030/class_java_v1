package useful.ch10;

//쓰레드를 사용하는 방법2번쟤 - RUnnable 인터페이스를 구현해서 만들수있다
public class Worker2 implements Runnable {

    //run() 위임 시키고자 하는 일을 명시하는 곳 (미리 약속되어있음 )
    @Override
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(i + "\t");

        }
    }
}
