package useful.ch12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Step4 {

    public static void main(String[] args) {

        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(11,30);

        // 두 시각 사이의 간격을 Duration 객체로 만들수있다
        Duration work = Duration.between(start,end);
        System.out.println("총 : " + work.toMinutes() + "분");
        //toMinutes -> 2시간 30분 --> 150분 전체를 분으로 표현함
        //part 가 붙은 메서드
        System.out.println("총 : " + work.toHoursPart() + "시간");//시간 자리만
        System.out.println("총 : " + work.toMinutesPart() + "분");// 시간을 빼고 남은 분만
        //시간만 가져오고 , 남은 분만 가져오는


    }
}
