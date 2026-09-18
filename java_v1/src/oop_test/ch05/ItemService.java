package oop_test.ch05;

import java.util.List;

public class ItemService {
    private ItemDao dao = new MemoryItemDao();

    public void obtainItem (String name, String grade) {
        Item item = new Item(name,grade);
        dao.insert(item);
    }

    public void printInventory () {
        List<Item> items =  dao.findAll();
        for (Item item : items) {
            System.out.println("이름 : "+item.getName() +" 등급 : " +item.getGrade());
        }
    }


}
