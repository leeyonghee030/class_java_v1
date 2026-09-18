package oop_test.ch05;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private String grade;

    public Item(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
