package useful.ch10;

//쓰레드를 추가로 만들어서 사용하는 방법 1. 상속활용
public class Worker3 extends Thread {

    int num;

    public Worker3(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("num + i : " + num + i );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
