package Swing.ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//이벤트 통신 ?
public class ColorChangeFrame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    private JPanel panel;
    private JPanel panel2;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button1  = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");
        panel = new JPanel();
        panel2 = new JPanel();

    }

    private void setInitLayout() {
        setLayout(new GridLayout(2,1));
        panel.setBackground(Color.YELLOW);
        panel2.setBackground(Color.GREEN);
        panel.add(button1);
        panel.add(button2);

        panel2.add(button3);
        panel2.add(button4);

        super.add(panel);
        super.add(panel2);

        setVisible(true);
    }

    private void addEventListener() {
        //button1 객체에 이벤트 리스너 등록 -> 약속 -> actionPerformed()메서드 콜백됨
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }
    //  ActionListener 의 추상 메서드를 구현 메서드로 재정의
    //  미리 약속되어 있는 메서드, 즉 어떤 이벤트가 발생하면
    //  이 해당 메서드 동작 되도록 설계 되어 있음 (콜백 메서드)
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(e.getSource());
        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton.getText());
//        selectedButton.setText("이벤트 발생");
        if (selectedButton == button1){
            panel.setBackground(Color.BLACK);
        } else if (selectedButton == button2) {
            panel.setBackground(Color.YELLOW);
        } else if (selectedButton == button3) {
            panel2.setBackground(Color.BLUE);
        } else if (selectedButton == button4) {
            panel2.setBackground(Color.GREEN);
        }


    }

    public static void main(String[] args) {
        new ColorChangeFrame();

        //메서드를 일반적으로 호출 a.abc();
        // 어떤 이벤트가 발생하면 콜백 불려져서 동작함 콜백메서드

    }


}
