
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.text.ParseException;

public class FenetreCalculatrice {
    public static void main(String[] args) throws ParseException {
        JFrame frame = new JFrame("RPN Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new BorderLayout()); 
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Bordure de 10 pixels sur tous les côtés

       MaskFormatter formatter = new MaskFormatter("#*#");
        formatter.setValidCharacters("0123456789+-*/ ");

        JFormattedTextField affichage = new JFormattedTextField(formatter);
        affichage.setValue(null);
      
        p.add(affichage, BorderLayout.PAGE_START);
        
        JPanel clavier = new JPanel (new GridLayout(4, 4, 10, 10));
//        JButton b1 =new JButton("1"); 
//        clavier.add(b1);
//        b1.addActionListener(new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//        	affichage.setText(((JButton)(e.getSource())).getText());     	
//        	}
//        });
        clavier.add(new JButton("7"));
        clavier.add(new JButton("8"));
        clavier.add(new JButton("9"));
        clavier.add(new JButton("+"));
        clavier.add(new JButton("4"));
        clavier.add(new JButton("5"));
        clavier.add(new JButton("6"));
        clavier.add(new JButton("-"));
        clavier.add(new JButton("1"));
        clavier.add(new JButton("2"));
        clavier.add(new JButton("3"));
        clavier.add(new JButton("*"));
        clavier.add(new JButton("Clear"));
        clavier.add(new JButton("0"));
        clavier.add(new JButton("Enter"));
        clavier.add(new JButton("/"));
        p.add(clavier, BorderLayout.CENTER);

        
        frame.getContentPane().add(p);
        
        frame.pack();
        frame.dispose();      
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}