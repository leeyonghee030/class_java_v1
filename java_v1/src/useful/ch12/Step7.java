package useful.ch12;

import java.time.Duration;
import java.time.LocalTime;

public class Step7 {

    public static void main(String[] args) {
        int sum = 0;

        LocalTime start = LocalTime.now();

        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
        LocalTime end = LocalTime.now();
        Duration work = Duration.between(start, end);

        System.out.println("시작시간 : " + start);
        System.out.println("종료시간 : " + end);
        System.out.println(work.toMillis() + "ms");
        //29ms = 0.029초

    }
}
