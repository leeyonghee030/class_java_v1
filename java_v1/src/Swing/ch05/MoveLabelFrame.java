package Swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveLabelFrame extends JFrame {

    private JLabel label;
    private final int MOVE_STEP = 10;
    private  int x = 225;
    private  int y = 200;
    private int moveCount = 0;



    public int setMoveCount() {
        return ++moveCount;
    }
    public int setMoveCount(int i) {
        return this.moveCount = i;
    }
    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("방향키로 별 움직이는 연습 이동 횟수 : " + moveCount );
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        label = new JLabel("☆");
        label.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        label.setSize(50, 50);
        label.setLocation(x, y);
    }

    private void setInitLayout() {
        setLayout(null); //좌표기반

        add(label);

        setVisible(true);
    }

    private void addEventListener() {
//        this.setFocusable(true);  이거 머하는 함수?
//        this.requestFocusInWindow(); 이거 머하는 함수?
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
//                int x = label.getX();
//                int y = label.getY();
                label.setText("★");

                if (keyCode == KeyEvent.VK_UP) {
                    label.setLocation(x,y -= MOVE_STEP);
                    setTitle("방향키로 별 움직이는 연습 이동 횟수 : " + setMoveCount());
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    label.setLocation(x -= MOVE_STEP,y);
                    setTitle("방향키로 별 움직이는 연습 이동 횟수 : " + setMoveCount());
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    label.setLocation(x += MOVE_STEP,y);
                    setTitle("방향키로 별 움직이는 연습 이동 횟수 : " + setMoveCount());
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    label.setLocation(x,y += MOVE_STEP);
                    setTitle("방향키로 별 움직이는 연습 이동 횟수 : " + setMoveCount());
                } else if (keyCode == 27) {
                    x = 225;
                    y = 200;
                    setMoveCount(0);
                    label.setLocation(x,y);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("☆");

            }
        });
    }

    public static void main(String[] args) {
        new MoveLabelFrame();
    }
}
