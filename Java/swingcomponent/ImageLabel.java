package com.simple.exam.swingcomponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageLabel extends JFrame implements ActionListener {

    JPanel jPanel;
    JLabel jLabel;
    JButton jButton;

    ImageLabel(){
        setSize(300,250);
        setTitle("이미지 레이블");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 객체생성 및 등록
        jPanel = new JPanel();
        jLabel = new JLabel("이미지를 보려면 아래 버튼을 클릭하세요.");
        jButton = new JButton("이미지 레이블");
        jButton.addActionListener(this);
        ImageIcon icon = new ImageIcon("icon.gif");
        jButton.setIcon(icon);

        jPanel.add(jLabel);
        jPanel.add(jButton);

        add(jPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            ImageIcon icon = new ImageIcon("dog.gif");
            jLabel.setIcon(icon);
            jLabel.setText(null);
    }

    public static void main(String[] args) {
        new ImageLabel();
    }
}