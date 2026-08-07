package ch05;

/**
 * 복합 대입 연산자
 * 대입 연산자와 다른 연산자가 함께 쓰이는것
 */
public class Operation3 {
    public static void main(String[] args) {
        int n1 = 100;
        n1 = n1 + 1; //101
        n1 = n1 + 1; //102 원래 값에서 +1씩 해주고 있다.
        n1 = n1 + 1; //귀찮음.. 간소화 하기 위해거 복합 대입 연사자르 활용할수있다

        //시작값 설정
        int score = 0;
        //score = score + 3;
        //1. 점수 추가
        score += 3; //복합 대입 연산자
        System.out.println("농구 점수 3점 추가" + score);

        //2. 점수 감점
        score -= 3;
        System.out.println(score);

        score = 6;
        System.out.println(score);
        //3. 점수 2배로 증가
        score *= 2;
        System.out.println(score);
        //4. 점수 2배로 감소
        score /= 2;
        System.out.println(score);
        //4. 점수에 대한 나머지 연산
        score %= 2;
        System.out.println(score);


    }
}
