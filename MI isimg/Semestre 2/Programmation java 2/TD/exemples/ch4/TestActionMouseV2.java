import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestActionMouseV2 {
	JButton ButOK, ButAnnuler;
	JLabel label;
	public TestActionMouseV2() {
		JFrame f = new JFrame("Interface Principale");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		ButOK = new JButton("OK");
		ButAnnuler = new JButton("Annuler");
		label = new JLabel();
		ButOK.addActionListener( e -> label.setText("OK") );
		ButAnnuler.addActionListener( e -> label.setText("Annuler") );
		ButOK.addMouseListener(new MyMouseListener());
		f.getContentPane().add(ButOK);
		f.getContentPane().add(ButAnnuler);
		f.getContentPane().add(label);
		f.setSize(300, 100);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new TestActionMouseV2());
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			System.out.println("Clic de souris");
		}
	}
}
