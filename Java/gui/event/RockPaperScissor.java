package com.simple.exam.gui.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener {
    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSOR = 2;

    private JPanel jPanel;
    JTextField output, information;
    private JButton rock;
    private JButton paper;
    private JButton scissor;

    RockPaperScissor(){
        // 윈도우 초기설정
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("가위바위보 게임");

        // 객체생성 및 객체 등록
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(0,3));

        output = new JTextField(20);
        information = new JTextField("아래의 버튼 중에서 하나를 클릭하시오.");

        rock = new JButton("바위");
        paper = new JButton("보");
        scissor = new JButton("가위");

        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);

        jPanel.add(rock);
        jPanel.add(paper);
        jPanel.add(scissor);

        add(jPanel);
        add(output,BorderLayout.NORTH);
        add(information,BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 컴퓨터가 먼저 가위/바위/보 중에서 하나를 결정
        Random random = new Random();
        int computer = random.nextInt(3);
        if(e.getSource() == rock){
            if(computer == SCISSOR){
                output.setText("사용자 승리");
            }else if(computer == ROCK){
                output.setText("비겼습니다.");
            }else {
                output.setText("컴퓨터 승리");
            }
        } else if (e.getSource() == paper) {
            if(computer == ROCK){
                output.setText("사용자 승리");
            }else if(computer == PAPER){
                output.setText("비겼습니다.");
            }else {
                output.setText("컴퓨터 승리");
            }

        }else if (e.getSource() == scissor) {
            if (computer == PAPER) {
                output.setText("사용자 승리");
            } else if (computer == SCISSOR) {
                output.setText("비겼습니다.");
            } else {
                output.setText("컴퓨터 승리");
            }
        }
    }

    public static void main(String[] args) {
        new RockPaperScissor();
    }
}
