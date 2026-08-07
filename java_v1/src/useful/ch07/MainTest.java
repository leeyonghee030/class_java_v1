package useful.ch07;

import com.oop14.Warrior;

public class MainTest {

    public static void main(String[] args) {

        Water water = new Water();
        Plastic plastic = new Plastic();

        GenericPrinter printer = new GenericPrinter();

//        printer.setMaterial(water);//사실 범위에 제한이 없기 떄문에
        // 무엇이든 들어 갈수있다

        printer.setMaterial(plastic);

        System.out.println(printer.getMaterial());

    }
}
