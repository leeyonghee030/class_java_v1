package Swing.ch03;

import javax.swing.*;
import java.awt.*;



public class SwingFrame extends JFrame {
    // 중첩 클래스 활용

    MyJPanel myJPanel;


    public SwingFrame() {
        setTitle("집꾸미기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        myJPanel = new MyJPanel();


        add(myJPanel);
        setVisible(true);

    }



    static class MyJPanel extends JPanel {

        private Image image;
        private Image image2;
        private Image image3;

        public MyJPanel() {
            image = new ImageIcon("image1.png").getImage();
            image2 = new ImageIcon("image2.png").getImage();
            image3 = new ImageIcon("image3.jpg").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.setColor(Color.RED);
            int[] xPoints = {250, 50, 450};
            int[] yPoints = {100, 200, 200};
            g.fillPolygon(xPoints, yPoints, 3);

            g.setColor(Color.BLACK);

            g.drawLine(250,100, 50, 200);
            g.drawLine(250,100, 450, 200);

            g.drawLine(50,200, 450, 200);

            g.drawLine(100,200, 100, 350);
            g.drawLine(400,200, 400, 350);

            g.drawLine(100,350, 400, 350);

            g.drawLine(275,225, 375, 225);
            g.drawLine(275,300, 375, 300);

            g.drawLine(275,225, 275, 300);
            g.drawLine(375,225, 375, 300);

            g.drawLine(325,225, 325, 300);
            g.drawLine(275,262, 375, 262);

            g.drawImage(image3,100,110,150,180,null);
            g.drawImage(image,75,100,200,200,null);
            g.drawImage(image2,300,300,180,180,null);

        }
    }

    public static void main(String[] args) {
        new SwingFrame();
    }

}
