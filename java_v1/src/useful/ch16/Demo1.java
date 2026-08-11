package useful.ch16;

import com.sun.source.tree.NewArrayTree;

public class Demo1 {
    //1. 람다 표현식에 대해 알아보지

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("작업가 해야할일 정릐");
            }
        }).start();

        //2. 위 코드를 람다식으로 사용해보자
        new Thread(() -> System.out.println("작업가 해야할일 정릐")).start();

        //3. 자바 컴파일러는 타입 추론이 가능하다
        //추상 메서드가 1개밖에 없어 추론가능
        new Thread(() -> {
            System.out.println("작업가 해야할일 정릐");
        }).start();
    }


}
