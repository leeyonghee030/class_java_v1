package useful.ch10;

public class WorkerMain3 {

    public static void main(String[] args) {
        System.out.println("메인시작");
        Worker3 worker3 = new Worker3(10);

        worker3.start();
        System.out.println("메인끝");


    }

}
