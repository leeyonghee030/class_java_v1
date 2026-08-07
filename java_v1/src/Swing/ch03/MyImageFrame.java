package Swing.ch03;

import javax.swing.*;
import java.awt.*;
import java.nio.channels.ClosedSelectorException;

public class MyImageFrame extends JFrame {

//    JPanel jPanel;
    // JPanel를 상속한 클래스라 기능을 다 물려 받았다
    MyImagePanel myImagePanel;

    public MyImageFrame() {
        setTitle("중첩 클래스 활영");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myImagePanel = new MyImagePanel();

        add(myImagePanel);
        setVisible(true);
    }

    //정적 내부 클래스 선언
    static class MyImagePanel extends  JPanel {

        private Image image1;

        public MyImagePanel() {
            image1 = new ImageIcon("image1.png").getImage();
            //ImageIcon?
        }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawString("이미지게임", 200, 200);
            g.drawLine(100, 100, 300, 100);
            g.drawImage(image1, 100, 100, 100, 100 , null);
            // ??
        }
    }

    //테스트 코드 작성
    public static void main(String[] args) {
        new MyImageFrame();
    }

}
