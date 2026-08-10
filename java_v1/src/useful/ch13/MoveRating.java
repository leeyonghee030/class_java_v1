package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MoveRating {
    public static void main(String[] args) {

        List<String> movies = new ArrayList<>();

        movies.add("범죄도시4 -*****");
        movies.add("기생충 -****");
        movies.add("올드보이 -****");
        movies.add("태권V -**");

        System.out.println("=== 전체 영화 목록 ===");

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + "." + movies.get(i));
        }

        System.out.println("\n" + movies.size() + "편");

        System.out.println("------");
//        movies.remove("올드보이 -****");
        movies.remove(2);
        System.out.println("\n" + movies.size() + "편");

        // 기생충 영화 여부 확인
        System.out.println("기생풍 존재 여부 확인 : " + movies.contains("기생충 -****"));

    }
}
