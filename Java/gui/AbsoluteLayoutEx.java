package com.simple.exam.gui;

import javax.swing.*;

public class AbsoluteLayoutEx extends JFrame {
    JButton button, button1, button2;

    AbsoluteLayoutEx(){
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("배치 관리자");

        // 배치관리자 설정
        JPanel  panel  = new JPanel();
        panel.setLayout(null);

        // 컴포넌트 생성 등록
        button = new JButton("버튼 1");
        button1 = new JButton("버튼 2");
        button2 = new JButton("버튼 3");

        // 컴포넌트의 크기와 위치를 설정
        button.setBounds(50,100,100,100);
        button1.setBounds(50,200,100,100);
        button2.setBounds(50,300,100,100);

        // 컴포넌트 이벤트 리스너 등록
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        add(panel);

        // 윈도우 활성화
        setVisible(true);
    }

    public static void main(String[] args) {
        new AbsoluteLayoutEx();
    }
}
