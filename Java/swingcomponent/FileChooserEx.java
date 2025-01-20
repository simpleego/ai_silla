package com.simple.exam.swingcomponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooserEx extends JFrame {
    JButton openButton, saveButton;
    JFileChooser fileChooser;

    FileChooserEx(){
        setTitle("파일선택기");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 객체생성
        fileChooser = new JFileChooser();
        openButton = new JButton("파일열기");
        saveButton = new JButton("파일저장");
        JLabel jLabel = new JLabel("파일 선택기 컴포넌트 테스트");

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int returnVal = fileChooser.showOpenDialog(null);
             if(returnVal == JFileChooser.APPROVE_OPTION){
                 File file = fileChooser.getSelectedFile();
             }else {

             }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int returnVal = fileChooser.showSaveDialog(null);
             if(returnVal==JFileChooser.APPROVE_OPTION){
                 File file = fileChooser.getSelectedFile();
             }else{

             }

            }
        });

        JPanel jPanel = new JPanel();

        jPanel.add(jLabel);
        jPanel.add(openButton);
        jPanel.add(saveButton);

        add(jPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FileChooserEx();
    }
}
