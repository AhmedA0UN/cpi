package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestDialog implements ActionListener {

    JButton button1, button2, button3, button4;
    JPanel panel1, panel2, panel3, panel4;
    JFrame f;

    public TestDialog() {
    	f= new JFrame();
        f.setTitle("Exemple JOptionPane");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        button1 = new JButton("Message Dialog");
        button2= new JButton("Confirm Dialog");
        button3 = new JButton("Autre Message Dialog");
        button4 = new JButton("Quitter");

        button1.addActionListener(this);
        panel1.add(button1);
        panel1.add(new JButton("Sans Clic"));

        
        button2.addActionListener(this);
        panel2.add(button2);
        
        button3.addActionListener(this);
        panel3.add(button3);
        
        button4.addActionListener(this);
        panel4.add(button4);

        f.getContentPane().setLayout(new GridLayout(2, 2));
        f.getContentPane().add(panel1);
        f.getContentPane().add(panel2);
        f.getContentPane().add(panel3);
        f.getContentPane().add(panel4);
        f.setSize(500, 400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(button1, "Message d'information", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == button2) {
            int response = JOptionPane.showConfirmDialog(button2, "Tu veux continuer ?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                System.out.println("Vous avez tapé 'Yes'");
            } else if (response == JOptionPane.NO_OPTION) {
                System.out.println("Vous avez tapé 'No'");
            } else if (response == JOptionPane.CANCEL_OPTION) {
                System.out.println("Vous avez tapé 'Cancel'");
            }
            else if (response == JOptionPane.CLOSED_OPTION) {
                System.out.println("Vous avez fermé la boite");
            }
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(button3, "Message d'avertissement !", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (e.getSource() == button4) {
        	f.dispose();
        } 
    }

    public static void main(String[] args) {
        new TestDialog();
    }
}
