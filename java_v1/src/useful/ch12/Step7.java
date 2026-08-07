package useful.ch12;

import java.time.Duration;
import java.time.LocalDateTime;

public class Step7 {

    public static void main(String[] args) {
        int sum = 0;

        LocalDateTime b = LocalDateTime.now();
        for (int i = 1; i <= 100_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
        LocalDateTime c = LocalDateTime.now();
        Duration work = Duration.between(b, c);
        System.out.println(work.toMillis() + "ms");
        //29ms = 0.029초

    }
}
