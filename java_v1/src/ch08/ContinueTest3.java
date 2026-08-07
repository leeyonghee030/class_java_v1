package ch08;

public class ContinueTest3 {
    public static void main(String[] args) {
        // 3 6 9 게임
        // 1부터 30까지 세되 3, 6,9 들어간 숫자는 "짝!" 이라고 외칩니다
        // 13, 16, 19 ,23, 26, 29

        //샘플 테스크 코드
        // 나머지 연산자와 10이라는 숫자르 이용하면 끝자리를 추출할수있다
        int intLast = 0;
        int last = 0;


        //3, 7, 9 나오게 하기
        for (int i = 1; i <= 100; i++) {
            if (i >= 30) {
                last = i % 30;
                //last == 4 ,5,6 하드코딩대신?
                if ( i % 30 == 0 || last == 1 || last == 2 || last == 3 ){
                    System.out.println("짝");
                    continue;
                }
            }

            if ((i % 10) > 0) {
                intLast = i % 10;
                if (intLast == 3 || intLast == 7 || intLast == 9 ) {
                    System.out.println("짝");
                    continue;
                }
            }
            System.out.println(i);
        }

    }
}
