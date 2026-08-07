package Swing.ch02;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {

        MyComponent myComponent = new MyComponent();

        myComponent.run();


        JTextField field = myComponent.getTextField();

        field.setText("홍길동");



    }
}
