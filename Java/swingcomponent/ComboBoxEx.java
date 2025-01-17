package com.simple.exam.swingcomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxEx extends JFrame implements ActionListener {
    JLabel jLabel;

    ComboBoxEx(){
        setSize(300,150);
        setTitle("동물 선택기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] animals = {"dog","lion","tiger"};
        JComboBox animalList = new JComboBox(animals);

        animalList.setSelectedIndex(0);
        animalList.addActionListener(this);

        jLabel = new JLabel();
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        changePicture(animals[animalList.getSelectedIndex()]);
        add(animalList, BorderLayout.PAGE_START);
        add(jLabel,BorderLayout.PAGE_END);

        setVisible(true);
    }

    private void changePicture(String animal) {
        ImageIcon icon = new ImageIcon(animal+".gif");
        jLabel.setIcon(icon);
        if(icon != null){
            jLabel.setText(null);
        }else {
            jLabel.setText("이미지가 발견되지 않았습니다.");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        String name = (String) cb.getSelectedItem();
        changePicture(name);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
