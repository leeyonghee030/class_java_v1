package useful.ch12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Step6 {

    public static void main(String[] args) {
        //도전과제 풀어 보기
        LocalDate birthday = LocalDate.of(1999,7,24);
        LocalDate now = LocalDate.of(2026,8,7);
        LocalDateTime now3 = LocalDateTime.of(2026,8,7,10,10);
        LocalDate now2 = LocalDate.of(2026,12,25);
        System.out.println("생일 요일 : " + birthday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));

        ChronoUnit days = ChronoUnit.DAYS;

        Period age = Period.between(birthday,now);
        System.out.println("만 나이 : " +age.getYears() + "세");
        System.out.println("살아온 날 : " + days.between(birthday,now) + "일");
        System.out.println("크리스마스까지 " + days.between(now,now2) + "일");

        //현재: 2025년 05월 13일 오후 02시 30분
        DateTimeFormatter nowFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        System.out.println("현재 : " + now3.format(nowFormatter));






    }
}
