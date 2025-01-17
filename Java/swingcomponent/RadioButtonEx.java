package com.simple.exam.swingcomponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonEx extends JFrame implements ActionListener {
    JRadioButton small,medium, large;
    JLabel jLabel, text;
    JPanel topPanel, sizePanel, resultPanel;

    RadioButtonEx(){
        setSize(300,150);
        setTitle("피자 주문기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        jLabel = new JLabel("어떤 크기의 피자를 주문하시겠습니까?");
        topPanel.add(jLabel);
        add(topPanel, BorderLayout.NORTH);

        small = new JRadioButton("Small Size");
        medium = new JRadioButton("medium Size");
        large = new JRadioButton("large Size");

        // 라디오 버튼 이벤트 등록
        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);

        ButtonGroup size = new ButtonGroup();
        size.add(small);
        size.add(medium);
        size.add(large);

        Border border = BorderFactory.createTitledBorder("크기");

        sizePanel = new JPanel();
        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        sizePanel.setBorder(border);

        add(sizePanel,BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("크기가 선택되지 않았습니다.");
        text.setForeground(Color.red);

        resultPanel.add(text);
        add(resultPanel,BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == small){
            text.setText("Small 크기가 선택되었습니다.");
        } else if (e.getSource() == medium) {
            text.setText("medium 크기가 선택되었습니다.");
        } else {
            text.setText("Large 크기가 선택되었습니다.");
        }
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
