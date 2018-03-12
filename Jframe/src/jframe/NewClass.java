/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lucas
 */
public class NewClass {
    public static void main(String[] args) {
       JFrame janela = new JFrame();
       
       JPanel painel1 = new JPanel();
       painel1.setBackground(Color.RED);
       
       JPanel painel2 = new JPanel();
       painel1.setBackground(Color.black);
       
       JPanel painel3 = new JPanel();
       painel1.setBackground(Color.green);
       
       janela.add(painel1);
       janela.add(painel2);
       janela.add(painel3);
         
       janela.setSize(600,600);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       janela.setVisible(true);
        
        
    }
}
