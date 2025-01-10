package com.simple.exam.interfaceex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class MyClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Beep");
    }
}

public class CallbackTest {
    public static void main(String[] args) throws InterruptedException {
        //ActionListener actionListener = new MyClass();

        Timer timer = new Timer(1000,
                e-> System.out.println("Beep"));
        timer.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
        }
    }
}
