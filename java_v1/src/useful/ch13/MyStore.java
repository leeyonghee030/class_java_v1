package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MyStore {
        public static void main(String[] args) {

        //방법 1 : ArrayList 타입을 선언
        ArrayList<String> list1 = new ArrayList<>();

        // 방법2 List타입으로 선언
        List<String> list2 =new ArrayList<>();
        //업케스팅 상태
        list1.add("사과"); // 요소 -> 바로 뒤 -> 맨끝에 추가 ,0번쨰 인데스
        list1.add(1,"포도"); //인덱스 1 위치에 추가
        list1.add(2,"김치");

        //갑자기 5인덱스로 띄어서 쓰면안돼?


        //조회
        list1.get(0);
        list1.size(); // 실제 안에 들어간 요소의 갯수
        list1.contains("김치"); // 포함여부 -> true, false
        list1.indexOf("김치"); // 위치 반환 ,업으면 -1반환


        //삭제
        list1.remove("포도"); //값으로 삭제
        list1.remove(0); //인덱스로도 삭제가능
        list1.clear(); //  전체 삭제

        //확인
        list1.isEmpty(); //비어있는지 확인 true / false

        System.out.println("---------------");
        list2.add("포도");
        list2.add("수박");
        list2.add(2,"호박");

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.contains("수박"));
        System.out.println(list2.indexOf("호박"));
        System.out.println(list2.indexOf("호"));

        list2.remove(0);
        System.out.println(list2.size());
        list2.clear();

        System.out.println(list2.isEmpty());


    }

}
