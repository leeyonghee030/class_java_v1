package comoop15;

public class Engin {

   private String name;

    public Engin(String name) {
        this.name = name;
    }
    
    public void start() {
        System.out.println(name + "엔진이 가동 됩니다");
    }
    
    public void stop() {
        System.out.println(name + "정지 합니다");
    }
}
