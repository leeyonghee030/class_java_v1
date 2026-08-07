package useful.ch12;

import com.oop10.Calculator;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class OldWay {

    public static void main(String[] args) {

        //Date - JDK1 버전에 만들어진 클래스
        //1. 현재 시간 출력
        Date now = new Date();
        System.out.println("현재 시간 : " + now);
        //일단 출력 형식부터 문제임. 영어 요일과 월 이름이 섞여 있어서
        // 사용자 화면에 그대로 쓸 수 없음

        //2. Date 로 특정 날짜 만들기
        Date date = new Date(1999, 7, 24);
        System.out.println("설정한 날짜" + date);
        // 3899년도로 결과가 확인 됨.
        // Date의 연도는 1900을 기준으로 세기 떄문에 그래서 1999년을 만들려고 하면
        // 99를 넣어야한다

        Date date2 = new Date(99,6,24); //1999년 7월 24일
        //Date moth 는 0~ 시작함
        //위와 같은 문제점 있는 부분떄문에 JDK1.1 부터 곧 바로 Calendar 클래스를 만들어 줬다

        System.out.println("-------------------------");

        //Date 타입에 대안 1.1에서
        Calendar cal = Calendar.getInstance(); // new Calendar <--싱글돈 패턴 구현 되아 있아
        //메서드로 호출해야함  싱글톤?
        cal.set(1999,6,24); //1999 7 24
        System.out.println(cal.getTime());
        //Sat Jul 24 09:26:51 KST 1999

        //위 문제들을 해결하기 위해서 8버전부터 java.time 패키지를 제공함
        LocalDate localDate = LocalDate.of(1999,7,24);
        System.out.println("설정한 날짜 : " + localDate);

    }
}
