/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class Jframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new JFrame();
        
        JPanel painel1 = new JPanel();
        painel1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        JPanel  painel2 = new JPanel();
        painel2.setBorder(BorderFactory.createLineBorder(Color.RED));
        JPanel painel3 = new JPanel();
        painel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        janela.add(painel3);
        painel1.add(painel2);
        painel1.add(new JLabel("Digite seu código"));
        painel1.add( new JTextField(20));
        painel1.add(new JButton("Enviar"));
        janela.add(painel1);
        
        janela.setSize(400,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
    
}
