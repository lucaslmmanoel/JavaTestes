package learning;

import javax.swing.JOptionPane;

public class Learning {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Olá, Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "Seja bem vinda " + nome);
        String option = JOptionPane.showInputDialog("você é solteira ou compromissada");
        if ("solteira".equals(option)){
            String numero = JOptionPane.showInputDialog("Pode me passar o seu número?");
            JOptionPane.showMessageDialog(null , "Seja bem vinda " + nome);
        }
        else if("compromissada".equals(option)){
            String fugida = JOptionPane.showInputDialog("Ta afim de dar uma fugida?(s/n)");
            if("s".equals(fugida)){
            JOptionPane.showMessageDialog(null, "Só vem então " + nome);
            }
            else if("n".equals(fugida)){
        JOptionPane.showMessageDialog(null, "nós se ver por aí " + nome);                       
                
            }
        }        
           
             
    }

}
