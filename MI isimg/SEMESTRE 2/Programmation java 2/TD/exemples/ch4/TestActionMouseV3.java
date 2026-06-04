import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestActionMouseV3 {
	JButton ButOK, ButAnnuler;
	JLabel label;
	public TestActionMouseV3() {
		JFrame f = new JFrame("Interface Principale");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		ButOK = new JButton("OK");
		ButAnnuler = new JButton("Annuler");
		label = new JLabel();
		ButOK.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("OK");		
			}
			
		});
		ButAnnuler.addActionListener( e -> label.setText("Annuler") );
		ButOK.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clic de souris");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
		});
		f.getContentPane().add(ButOK);
		f.getContentPane().add(ButAnnuler);
		f.getContentPane().add(label);
		f.setSize(300, 100);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new TestActionMouseV3());
	}

}
