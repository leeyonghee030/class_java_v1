package design.builder;

public class MainTest1 {

    public static void main(String[] args) {
        // 빌더 패턴으로 클래스 생성해보기
        Burger burger1 = new Burger.Builder()
                .bread("참깨방")
                .patty("소고기")
                .sauce("케첩")
                .build();

        System.out.println(burger1);

        // 순서를 바꿔도 되고, 원하는 것만 넣어도 된다( 넣지 않은 값은 null)
        Burger burger2 = new Burger.Builder()
                .patty("치킨")
                .bread("호밀빵")
                .build();

        System.out.println(burger2);

        // //////////////////// 위와 같은 동작 ///////////////////////////
        Burger.Builder builder = new Burger.Builder();

        builder.bread("참깨방");
        builder.patty("소고기");
        builder.sauce("케첩");

        // Burger burger3 = new Burger(builder);
        Burger burger3 = builder.build();

    }
}
