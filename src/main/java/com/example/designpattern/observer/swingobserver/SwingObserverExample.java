package com.example.designpattern.observer.swingobserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuguobin
 * @Title: SwingObserverExample
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: swing 中的观察者模式
 * @date 2020/6/29 10:35 AM
 */
public class SwingObserverExample {

    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample observerExample = new SwingObserverExample();
        observerExample.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it ?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
        jFrame.doLayout();
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it ！");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Just do it ！");
        }
    }
}
