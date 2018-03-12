package jpanel;

public class JPanel {

    public static void main(String[] args) {
       
        
        
        
        
        
        painel2.add(painel3);
        painel1.add(painel2);
        painel1.add(new JLabel("Digite seu Código"));
        painel1.add(new JTextField(10));
        painel.add(new JButton("Enviar"));
        janela.add(painel1);
        
        
        janela.setSize(400,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
