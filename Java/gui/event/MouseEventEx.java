package com.simple.exam.gui.event;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventEx extends JFrame implements MouseListener, MouseMotionListener {

    MouseEventEx(){
        setTitle("마우스 이벤트");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.addMouseListener(this);
        jPanel.addMouseMotionListener(this);

        add(jPanel);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        display("Mouse Clicked "+e.getClickCount(),e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
            display("mouse Pressed"+e.getClickCount(),e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
            display("mouse Released"+e.getClickCount(), e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
            display("mouse Entered",e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
            display("mouse Exited", e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        display("Mouse dragged",e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
            display("Mouse Moved",e);
    }

    private void display(String s, MouseEvent e) {
        System.out.println(s+"X="+e.getX()+"Y="+e.getY());
    }

    public static void main(String[] args) {
        new MouseEventEx();
    }
}
