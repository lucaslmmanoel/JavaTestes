/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lucas
 */
public class testingframes {

    JFrame tela = new JFrame("Window example");
    JPanel panel01 = new JPanel();
    JPanel panel02 = new JPanel();
    JPanel panel03 = new JPanel();

    public testingframes() {
        tela.setSize(800, 800);

        panel01.setBackground(Color.black);
        panel02.setBackground(Color.red);
        panel03.setBackground(Color.yellow);

        panel01.setSize(100, 1000);
        panel02.setSize(100, 500);
        panel03.setSize(100, 400);

        tela.add(panel01, BorderLayout.NORTH);
        tela.add(panel02, BorderLayout.CENTER);
        tela.add(panel03, BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        testingframes frames = new testingframes();
    }
}
