package comoop15;

public class Cpu {
    private String name;

    public Cpu(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + " cpu가 켜졌습니다");
    }

    public void stop() {
        System.out.println(name + " cpu가 꺼졌습니다");
    }
}
