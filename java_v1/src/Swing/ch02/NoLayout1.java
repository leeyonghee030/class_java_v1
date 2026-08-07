package Swing.ch02;

import javax.swing.*;

public class NoLayout1 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayout1() {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    private void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");

    }


    private void setInitLayout() {
        //setLayout(null); => null값을 주면 좌표 기반으로 배치할수있다
        //주의점 좌표기반 배치관리자를 사용하면
        //반드시 컴퍼넌트의 크기를 지정해야하고 x,y 축를 지정해야한다
        setLayout(null);

        button1.setSize(100,100);
        button1.setLocation(250,250);

        button2.setSize(100,100);
        button2.setLocation(50,50);

        button3.setSize(100,100);
        button3.setLocation(450,450);


        //주의 프레임에 add 를 해주어야한다

        add(button1);
        add(button2);
        add(button3);

        setVisible(true);
    }


}
