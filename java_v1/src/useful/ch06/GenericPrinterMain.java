package useful.ch06;

import java.util.ArrayList;

public class GenericPrinterMain {

    public static void main(String[] args) {
        //제네릭 프로그래밍을 활용하면 타입에 안정성을 줘서 컴파일시 명확하게
        //타입을 지정할수있다

        Plastic plastic1 = new Plastic();
        Powder powder = new Powder();

        GenericPrinter<Plastic> printer1 = new GenericPrinter();
        GenericPrinter<Powder> printer2 = new GenericPrinter();
        //즉 코드를 사용하는 시점애 대체 문자열에 명확한 타입을 지정할수있다

        printer1.setMaterial(plastic1);


        printer2.setMaterial(powder);

        //다운 캐스팅이 필요없다 -> 즉 타입에 안정석을 줄 수 있다
        Plastic trmpPlastic = printer1.getMaterial();

        ArrayList<Integer> list = new ArrayList();
        list.add(10);
//        list.add(10.0); 오류 발생

        //warper 클래스로 변경 int를

    }
}
