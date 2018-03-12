import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeColor {
    JFrame frame = new JFrame("Color changer");

    JPanel setcolor = new JPanel();
    JPanel showcolor = new JPanel();

    JButton br = new JButton("RED");
    JButton bg = new JButton("GREEN");
    JButton bb = new JButton("BLUE");


    ChangeColor() {


        setcolor.setSize(400, 100);
        setcolor.setBackground(Color.BLACK);
        setcolor.setLayout(new FlowLayout());
        setcolor.add(br);
        setcolor.add(bg);
        setcolor.add(bb);


        
        frame.setLayout(new BorderLayout());
        frame.add(setcolor, BorderLayout.NORTH);
        frame.add(showcolor, BorderLayout.CENTER);
        frame.setSize(400, 600);
        frame.setVisible(true);


        br.addActionListener(new Listener());
        bg.addActionListener(new Listener());
        bb.addActionListener(new Listener());

    }

    class Listener extends JPanel implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Color color;
            if (event.getSource() == br) {
                color = Color.red;
                showcolor.setBackground(color);
            } else if (event.getSource() == bg) {
                color = Color.green;

                showcolor.setBackground(color);
            } else {
                color = Color.blue;

                showcolor.setBackground(color);
            }
        }
    }


    public static void main(String[] args) {
        /* creating the structure*/

        new ChangeColor();

    }


}
