import javax.swing.*;
import java.awt.*;

public class FenetrePanel{

	JFrame f;
	JPanel p;
	JButton b1, b2, b3, b4;

	public FenetrePanel() {
		f =new JFrame();
		f.setTitle("Test JPanel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
	
		p = new JPanel();

		b1  = new JButton("Bouton1");
		b2  = new JButton("Bouton2");
		b3  = new JButton("Bouton3");
		b4  = new JButton("Bouton4");
		
	 p.setLayout(new FlowLayout(FlowLayout.LEADING,30,50));
         p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
//       p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));
	 	 p.setBorder(BorderFactory.createTitledBorder("Bordure"));

		p.add(b3,0);
		p.add(b4,1);
		p.add(b2);
		p.add(b1,2);
		//p.remove(1);
		f.getContentPane().add(p, BorderLayout.PAGE_START);

	f.pack();
        f.dispose();      
        f.setLocationRelativeTo(null);
	f.setVisible(true);
			
	}
	
	public static void main(String[] args) {
		new FenetrePanel();

	}
	

}
