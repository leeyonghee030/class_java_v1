package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {

        //도전과제 stream API 를 사용하지 안들고 만들어보기

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                numbers2.add(n*n);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println("확인용 : " + numbers.get(i));
            }
        }//일부러 길게 적어봤어

        System.out.println(numbers2); //toList로 했어

        System.out.println("-----------");

        numbers.stream()
                .filter((n) -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(n -> System.out.println("짝수 제곱값 : " + n));


    }
}
