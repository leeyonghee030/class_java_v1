package useful.ch14;

public class HashTableTest {

    public static void main(String[] args) {

        String[] names = {"사과", "딸기", "바나나", "수박", "포도"};

        for (String n : names) {
            System.out.println(n +" -> " + n.hashCode());
        }
        //사과 -> 1573328
        System.out.println("----------");
        System.out.println("사과".hashCode());


    }
}
