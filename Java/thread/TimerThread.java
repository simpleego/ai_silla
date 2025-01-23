package com.simple.exam.thread;

import javax.swing.*;

public class TimerThread  extends Thread {
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n=0;
        while (true){
            timerLabel.setText(String.valueOf(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
