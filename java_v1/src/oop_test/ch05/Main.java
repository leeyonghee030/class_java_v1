package oop_test.ch05;

public class Main {
    public static void main(String[] args) {
            ItemService service = new ItemService();

            service.obtainItem("검","하");
            service.obtainItem("검","중");
            service.obtainItem("검","상");

            service.printInventory();
    }
}
