import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestActionMouseV1 implements ActionListener {
	JButton ButOK, ButAnnuler;
	JLabel label;
	public TestActionMouseV1() {
		JFrame f = new JFrame("Interface Principale");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		ButOK = new JButton("OK");
		ButAnnuler = new JButton("Annuler");
		label = new JLabel();
		ButOK.addActionListener(this);
		ButAnnuler.addActionListener(this);
		ButOK.addMouseListener(new MyMouseListener());
		f.getContentPane().add(ButOK);
		f.getContentPane().add(ButAnnuler);
		f.getContentPane().add(label);
		f.setSize(300, 100);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new TestActionMouseV1());
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ButOK)
			label.setText("OK");
		else if (e.getSource() == ButAnnuler)
			label.setText("Annuler");
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			System.out.println("Clic de souris");
		}
	}
}
