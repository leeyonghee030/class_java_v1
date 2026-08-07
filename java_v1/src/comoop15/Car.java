package comoop15;

import com.oop14.Cat;

public class Car {

    private String name;
    private Engin engin;

    public Car(String name) {
        this.name = name;
        //합성의 조건 1 : 밖에서 받지안고 생성자에서 직접 객체를 생성한다
        //즉, Car 객체가 태어날떄 Engin 객체도 함꼐 태어난다
        this.engin = new Engin("v8");
    }

    //합성의 조건 2: getEngine() 을 만들지 않는다
    //내부의 Engine 객체를 밖으로 꺼내 주지 않겠다는 뜻


    public void start() {
        engin.start(); // 엔진에 시동이 걸려야한다
        System.out.println(name + "가 출발합니다");
    }

    void stop() {
        engin.stop();
        System.out.println("자동차가 정지합니다");
    }
}
