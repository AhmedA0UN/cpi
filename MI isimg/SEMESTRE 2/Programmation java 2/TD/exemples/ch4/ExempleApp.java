import javax.swing.*;
import java.awt.*;

public class ExempleApp{
	
    public ExempleApp() {
    	JFrame f= new JFrame("Exemple d'application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.GREEN);
        f.getContentPane().add(topPanel, BorderLayout.PAGE_START);

        JPanel leftPanel = new JPanel();   
      leftPanel.setBackground(Color.BLUE);
      
      leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
      leftPanel.add(new JButton("Bouton 1"));
      leftPanel.add(Box.createVerticalStrut(10));
      leftPanel.add(new JButton("Bouton 2"));
      leftPanel.add(Box.createVerticalStrut(10));
      leftPanel.add(new JButton("Bouton 3"));
        
//        leftPanel.setLayout(new BorderLayout());      
//        JPanel pp = new JPanel( new GridLayout(3,1,10,10));
//        pp.add(new JButton("Bouton 1"));
//        pp.add(new JButton("Bouton 2"));
//        pp.add(new JButton("Bouton 3"));
//        leftPanel.add(pp, BorderLayout.PAGE_START);
        
        f.getContentPane().add(leftPanel, BorderLayout.LINE_START);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GRAY);
        centerPanel.setLayout(new GridLayout(2, 2));
        centerPanel.add(new JLabel("Case 1",SwingConstants.CENTER));
        centerPanel.add(new JLabel("Case 2",SwingConstants.CENTER));
        centerPanel.add(new JLabel("Case 3",SwingConstants.CENTER));
        centerPanel.add(new JLabel("Case 4",SwingConstants.CENTER));
        f.getContentPane().add(centerPanel, BorderLayout.CENTER);

        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.YELLOW);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(new JButton("OK"));
        bottomPanel.add(new JButton("Annuler"));
        f.getContentPane().add(bottomPanel, BorderLayout.PAGE_END);     
        
        f.setSize(400, 400);
     // f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new ExempleApp();
    }
}

