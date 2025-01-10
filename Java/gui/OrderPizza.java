package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;

public class OrderPizza extends JFrame {

    OrderPizza(){
        setSize(550,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("피자 주문");
        setResizable(true);

        // 레이아웃 설정
        //setLayout(new FlowLayout());

        // 패널생성
        JPanel panelContainer = new JPanel();
        JPanel panelTitle = new JPanel();
        JPanel panelMenu = new JPanel();

        panelContainer.setBackground(Color.yellow);

        // 패널에 컴포넌트 생성 및 등록
        JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다.");
        panelTitle.add(label);
        panelTitle.setBackground(Color.green);

        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토피자");
        JButton button3 = new JButton("불고기피자");
        panelMenu.setBackground(Color.BLUE);
        panelMenu.add(button1);
        panelMenu.add(button2);
        panelMenu.add(button3);

        //panelContainer.add(panelTitle);
        //panelContainer.add(panelMenu);

        // 패널을 최상위 프레임에 등록
        add(panelTitle,BorderLayout.NORTH);
        add(panelMenu,BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OrderPizza();
    }
}
