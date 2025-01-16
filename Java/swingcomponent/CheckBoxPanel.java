package com.simple.exam.swingcomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxPanel extends JPanel implements ItemListener {
    final int ITEM_COUNT = 3;

    JCheckBox[] buttons = new JCheckBox[ITEM_COUNT];
    String[] fruits ={"apple","grape","orange"};
    JLabel[] pictureLabel = new JLabel[ITEM_COUNT];
    ImageIcon[] icons = new ImageIcon[ITEM_COUNT];

    CheckBoxPanel(){
        super(new GridLayout(0,4));

        for (int i = 0; i < ITEM_COUNT; i++) {
            buttons[i] = new JCheckBox(fruits[i]);
            buttons[i].addItemListener(this);
            pictureLabel[i] = new JLabel(fruits[i]+".gif");
            icons[i] = new ImageIcon(fruits[i]+".gif");
        }
        JPanel checkPanel = new JPanel(new GridLayout(0,1));
        for (int i = 0; i <ITEM_COUNT; i++) {
            checkPanel.add(buttons[i]);
            add(checkPanel);
            add(pictureLabel[0]);
            add(pictureLabel[1]);
            add(pictureLabel[2]);
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        ImageIcon image = null;
        Object source = e.getItemSelectable();
        for (int i = 0; i < ITEM_COUNT; i++) {
            if(source == buttons[i]){
                if(e.getStateChange() == ItemEvent.DESELECTED){
                    pictureLabel[i].setIcon(null);
                }else {
                    pictureLabel[i].setIcon(icons[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("체크박스 연습");
        win.setSize(500,200);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CheckBoxPanel panel = new CheckBoxPanel();
        panel.setOpaque(true);
        win.add(panel);
        win.setVisible(true);
    }
}
