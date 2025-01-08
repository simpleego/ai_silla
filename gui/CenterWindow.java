package com.simple.exam.gui;

import javax.swing.*;
import java.awt.*;

public class CenterWindow extends JFrame {

    CenterWindow(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        setSize(300,200);
        setLocation(screenSize.width/2, screenSize.height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("윈도우 가운데 설정");
        Image image = toolkit.getImage("icon.gif");
        setIconImage(image);

        setLayout(new FlowLayout());

        // 컴포넌트 생성
        JButton button = new JButton("버튼");

        // 컴포넌트 등록 및 배치
        this.add(button);

        setVisible(true);

    }

    public static void main(String[] args) {
        new CenterWindow();
    }
}
