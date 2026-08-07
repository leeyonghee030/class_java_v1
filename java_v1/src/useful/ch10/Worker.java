package useful.ch10;

//쓰레드를 추가로 만들어서 사용하는 방법 1. 상속활용
public class Worker extends Thread {

    String name;

    public Worker(String name) {
        this.name = name;
    }

    // 약속되어 있는 부분 run() 추상메서드 안에서 작없자(쓰레드)에게
    //어떤일을 시킬지 정의 해주어야한다
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker : " + name + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
