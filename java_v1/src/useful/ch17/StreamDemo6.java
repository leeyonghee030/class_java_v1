package useful.ch17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo6 {
        // sorted - 중간연산
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,5,3,1,2);

        //오름차순
        List<Integer> asc =numbers.stream()
                .sorted()
                .toList();

        System.out.println(asc);

        //내림차순
        List<Integer> desc = numbers.stream()
                .sorted(Comparator.reverseOrder())//내림차순
                .toList();

        System.out.println(desc);


    }
}
