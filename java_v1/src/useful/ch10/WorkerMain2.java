package useful.ch10;

public class WorkerMain2  {

    public static void main(String[] args) {

        System.out.println("------main 쓰레드시작 ----- ");
        Worker2 worker2 = new Worker2();
        //쓰레드를 동작시킬려면 무조건 Thread.start(); 호출해야함

        new Thread(worker2).start();
        // 객체 생성후 체인?
        //

//        Thread t = new Thread(Worker2);
//        t.start();

        System.out.println("------main 쓰레드 종료 ----- ");

    }

}
