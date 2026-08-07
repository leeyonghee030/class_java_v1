package Swing.ch06;

import javax.swing.*;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();

    }

    private void initData(){
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //배경 이미지 설정해보기
        //
        ImageIcon backgroundIcon = new ImageIcon("images.backgroundMap.png");
        backgroundMap = new JLabel();
        player = new JLabel();

    }

    private void setInitLayout() {}

    private void addEventListener() {}

}
