package useful.ch12;

import java.time.LocalDate;

public class Step2 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2026,8,7);
        LocalDate today2 = LocalDate.now();

        System.out.println("100일후 : " + today.plusDays(100));
        System.out.println("다음달 : " + today2.plusMonths(1));
        System.out.println("일년전 : " + today2.plusYears(-1));
    }
}
