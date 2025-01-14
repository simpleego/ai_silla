package com.simple.exam.gui.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventTest extends JFrame implements KeyListener {

    private JPanel jPanel;
    private JTextField jTextField;
    private JTextArea jTextArea;
    KeyEventTest(){
        // 윈도우 초기설정
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("키보드 이벤트 처리");

        // 컴포넌트 생성 및 등록
        jPanel = new JPanel();
        jTextField = new JTextField(10);
        jTextArea = new JTextArea(3,30);

        jPanel.add(new JLabel("문자를 입력하세요"));
        jPanel.add(jTextField);
        add(jPanel,BorderLayout.NORTH);
        add(jTextArea,BorderLayout.CENTER);

        // 컴포넌트 이벤트 등록
        jTextField.addKeyListener(this);

        setVisible(true);

    }

    public static void main(String[] args) {
        new KeyEventTest();
    }

    @Override
    public void keyTyped(KeyEvent e) {
            display(e,"Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        display(e,"Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        display(e,"Key Released");
    }

    private void display(KeyEvent e, String keyTyped) {
        char ch = e.getKeyChar();
        int code = e.getKeyCode();

        String modifiers = "ALT:"+e.isAltDown()+"Ctrl:"+e.isControlDown()+
                "Shift:"+e.isShiftDown();

        jTextArea.append(">>"+keyTyped+"문자"+ch+"(코드:"+code+")"+modifiers+"\n");
    }
}
