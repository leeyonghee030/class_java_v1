package useful.ch05;

public class ThreeDPrinter3 {
    //재료
    Object powder;

    //재료를 꺼냄
    public Object getMaterial() {
        return powder;
    }

    //재료를 넣음
    public void setMaterial(Object material) {
        this.powder = material;
    }


    //테스트 코드작성

    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        Powder powder = new Powder();
        ThreeDPrinter3 printer3 = new ThreeDPrinter3();

        System.out.println("-----------");
        printer3.setMaterial(powder);
        System.out.println(printer3.getMaterial());

        System.out.println("-----------");
        printer3.setMaterial(plastic);
        System.out.println(printer3.getMaterial());

        //타입을 선언해서 저장 시켜보자
        Powder tempPowder = (Powder) printer3.getMaterial();
        //Object로 쓰면 강제 형변환 해야해서 불편하다

    }
}
