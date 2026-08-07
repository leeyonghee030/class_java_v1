package useful.ch05;

public class ThreeDPrinter2 {
    //재료
    Powder powder;

    //재료를 꺼냄
    public Powder getMaterial() {
        return powder;
    }

    //재료를 넣음
    public void setMaterial(Powder material) {
        this.powder = material;
    }


    //테스트 코드작성

    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter2 printer2 = new ThreeDPrinter2();

        printer2.setMaterial(powder);

        System.out.println("-----------");
        System.out.println(printer2.getMaterial());


    }
}
