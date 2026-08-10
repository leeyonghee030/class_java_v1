package useful.ch15;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class ScoreHashMap {

    public static void main(String[] args) {

        Map<String, Integer> score = new HashMap<>();

        //추가
        score.put("철수",90);
        score.put("영희",80);
        score.put("민준",92);
        score.put("철수",100);
        //put() 사용해서 키값이 중복이된다면 덮어씌우기가 된다
        // 이 특징을 활용하면 업데이트 기능을 구현할수있다

        System.out.println(score);

        //조회
        System.out.println(score.get("철수"));//있으면 Value 반환
        System.out.println(score.get("없음"));//키없으면 null

        //포함 여부
        System.out.println(score.containsKey("철수")); //키존재여부
        System.out.println(score.containsValue(80));//값존재여부

        //삭제
        int removedResult = score.remove("철수");
        //삭제시 Value 값 리턴
        System.out.println(removedResult+ "가 삭제 되었습니다 ");
        System.out.println(score);

        //크기확인
        System.out.println(score.size());

        //전체순회
        for (String k : score.keySet()) {
            System.out.println(k + ": " + score.get(k) + "점");
        }

    }
}
