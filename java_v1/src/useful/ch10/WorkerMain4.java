package useful.ch10;

public class WorkerMain4 {

    public static void main(String[] args) {

        System.out.println("메인 시작 ");
        Worker4 worker4 = new Worker4();

        new Thread(worker4).start();

        System.out.println("메인 끝");
    }
}
