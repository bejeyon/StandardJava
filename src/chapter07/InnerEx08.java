package chapter07;

import java.awt.*;
import java.awt.event.*;

public class InnerEx08 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }); // 익명클래스의 끝
    }   // main의 끝
}   // InnerEx08의 끝
