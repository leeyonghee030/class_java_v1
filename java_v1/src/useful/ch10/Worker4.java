package useful.ch10;

//쓰레드를 추가로 만들어서 사용하는 방법 1. 상속활용
public class Worker4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("i : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
