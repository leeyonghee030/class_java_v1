package oop_test.ch02;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Board {

    private String title;
    private String content;

    public Board (String title, String content) {
        this.title =title;
        this.content = content;
    }
}
