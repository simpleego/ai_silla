package com.simple.exam.swingcomponent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderEx extends JFrame implements ChangeListener {

    static final int INIT_VALUE = 5;
    JButton buttonOK;
    JSlider slider;
    JButton button;

    SliderEx(){
        setSize(300,150);
        setTitle("동물 확대기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("슬라이드를 움직여보세요.");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);

        slider = new JSlider(0,30,INIT_VALUE);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(this);
        panel.add(slider);

        button = new JButton("");
        ImageIcon icon = new ImageIcon("dog.gif");
        button.setIcon(icon);
        button.setSize(INIT_VALUE*10, INIT_VALUE*10);

        panel.add(button);

        add(panel);

        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();

        if(!source.getValueIsAdjusting()){
            int value = source.getValue();
            button.setSize(value*10,value*10);
        }
    }

    public static void main(String[] args) {
        new SliderEx();
    }
}
