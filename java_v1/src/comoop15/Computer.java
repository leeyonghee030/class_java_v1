package comoop15;



public class Computer {
    private String name;
    private Cpu cpu;

    public Computer(String name) {
        this.name = name;

        this.cpu = new Cpu("몰라");
    }

    public void start() {
        cpu.start();
        System.out.println(name + " 컴퓨터가 켜졌습니다");
    }

    public void stpo() {
        cpu.stop();
        System.out.println(name + " 컴퓨터가 꺼졌습니다");
    }
}
