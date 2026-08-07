package comoop15;

public class CarMainTest {


    public static void main(String[] args) {

        Car car =new Car("BMW");

        car.start();
        car.stop();

        //밖에서는 Engine 객체의 접근할 방법이 없다.
        //합성 관계라고 말할수있다

    }
}
