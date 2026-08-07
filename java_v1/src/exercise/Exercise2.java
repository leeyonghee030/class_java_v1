package exercise;

public class Exercise2 {
    public static void main(String[] args) {
        // 1. 정수 550 을 tecoBox1 이름으로 변수에 담아 보세요.
        int tecoBox1 = 550;
        // 2. 정수 22억을 tecoBox2 이름으로 변수에 담아 보세요.
        long tecoBox2 = 2200000000L;
        // 3. 문자 A를 tecoBox3 이름으로 변수에 담아 보세요.
        char tecoBox3 = 'A';
        // 4. 실수 float 타입으로 0.12345678을 tecoBox4 이름으로 변수에 담아 보세요.
        float tecoBox4 = 0.12345678f;
        // 5. 실수 double 타입으로 200.0035을 tecoBox5 이름으로 변수에 담아 보세요.
        double tecoBox5 = 200.0035;
        // 6. 논리 자료형 isOk 이름의 변수를 선언해 보세요.
        boolean isOk;
        // 7. isOk 변수에 값을 false로 초기화 해보세요.
        isOk = false;
        // 8. isOk 변수에 값을 true로 변경해 보세요.
        isOk = true;
        // 9. 변수란 무엇인지 서술해 보세요.
        // -> 변하는 값을 넣는 상자

        // 10. 기본 데이터 타입에 종류 8가지를 서술해 보세요.
        // 표기방법 (byte, short , ...)
        // 정수형 : byte, short, int, long
        // 실수형 : float, double
        // 문자형 : char
        // 논리형 : boolean


        // ===== 변수 & 데이터 타입 기본 =====

        // 1. 정수 100을 numBox 이름으로 변수에 담아 출력해 보세요.
        int numBox = 100;
        System.out.println(numBox);

        // 2. 정수 50억을 bigBox 이름의 변수에 담아 보세요. (힌트: int 범위를 넘어감)
        long bigBox = 5000000000L;

        // 3. 문자 'K'를 charBox 이름으로 변수에 담아 보세요.
        char charBox = 'K';

        // 4. float 타입으로 3.14를 piBox 이름의 변수에 담아 보세요.

        float piBox = 3.14f;
        // 5. double 타입으로 9.8을 gravityBox 이름의 변수에 담아 보세요.
        double gravityBox = 9.8;

        // 6. boolean 타입 isStudent 변수를 선언만 하고, true로 초기화해 보세요.
        boolean isStudent;
        isStudent = true;

        // ===== 변수의 성질 =====

        // 7. int score = 80; 을 선언하고, 값을 95로 바꾼 뒤 출력해 보세요.
        int score = 80;
        score = 95;
        System.out.println(score);

        // 8. int x = 5; int y = 9; 를 선언하고 두 값을 서로 스위칭해 보세요.
        //    (스위칭 후 x는 9, y는 5가 되어야 함)
        int x = 5;
        int y = 9;

        int copy = x;

        x = y;
        y = copy;


        // ===== 개념 서술 =====

        // 9. char는 사실 어떤 타입에 속하는지 쓰고, 그 이유를 한 줄로 서술해 보세요.
        // -> char는 정수형 문자를 숫자로 저장하고 문자표로 변환해 보여준다

        // 10. 실수형에서 double이 기본 타입인 이유를 서술해 보세요.
        // -> double가 float 보다 크기가 커서 소수를 더 정밀하게 표시할수있다

        // 11. byte가 -128 ~ 127까지만 담을 수 있는 이유를 서술해 보세요. (힌트: 비트, 부호)
        // ->  byte는 1바이트(8비트 [][][][][][][][]
        // 맨 앞 1비트를 부호(0양수,1음수)로 쓰기 때문에  표현 범위가 -128~127로 정해진다.

        // 12. 다음 중 변수 이름으로 쓸 수 없는 것을 모두 고르고, 이유를 쓰세요.
        //     (가) age   (나) 2names   (다) for   (라) _count   (마) user$name
        // -> 나 맨앞에 숫자가 오면 오류가나서 , 다   먼저 만들어져있는 예약어라서

    }
}
