package useful.ch05;

public class ThreeDPrinter1 {
    //재료
    Plastic material;

    //재료를 꺼냄
    public Plastic getMaterial() {
        return material;
    }

    //재료를 넣음
    public void setMaterial(Plastic material) {
        this.material = material;
    }


    //테스트 코드작성

    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        ThreeDPrinter1 printer1 = new ThreeDPrinter1();

        printer1.setMaterial(plastic);

        System.out.println("-----------");
        System.out.println(printer1.getMaterial());


    }
}
