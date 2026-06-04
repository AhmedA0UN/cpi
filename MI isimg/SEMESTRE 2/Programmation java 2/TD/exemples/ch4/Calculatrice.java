import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculatrice implements ActionListener {

	private JFrame fen;
	private JButton boutonCompteur;
	private JLabel labNombre1, labNombre2, labClic;
	private JTextField nombre1, nombre2;
	private String etiqNombre1 = "  Numéro 1 : ", etiqNombre2 = "  Numéro 2 : ", etiqClic = "Résultat = ";
	private JRadioButton rBtn1, rBtn2, rBtn3, rBtn4;

	public Calculatrice() {
		fen = new JFrame("ExerciceSwing");
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel(new GridLayout(2, 1));
		// p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		JPanel p1 = new JPanel(new FlowLayout());
		labNombre1 = new JLabel(etiqNombre1);
		nombre1 = new JTextField(20);
		p1.add(labNombre1);
		p1.add(nombre1);

		JPanel p2 = new JPanel(new FlowLayout());
		labNombre2 = new JLabel(etiqNombre2);
		nombre2 = new JTextField(20);
		p2.add(labNombre2);
		p2.add(nombre2);

		p.add(p1);
		p.add(p2);

		fen.getContentPane().add(p, BorderLayout.PAGE_START);

		rBtn1 = new JRadioButton("+");
		rBtn2 = new JRadioButton("-");
		rBtn3 = new JRadioButton("*");
		rBtn4 = new JRadioButton("/");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rBtn1);
		bg.add(rBtn2);
		bg.add(rBtn3);
		bg.add(rBtn4);

		JPanel p3 = new JPanel(new FlowLayout());
		p3.add(rBtn1);
		p3.add(rBtn2);
		p3.add(rBtn3);
		p3.add(rBtn4);
		fen.getContentPane().add(p3, BorderLayout.CENTER);


		JPanel p4 = new JPanel(new FlowLayout());
		boutonCompteur = new JButton("CALCUL");
		boutonCompteur.addActionListener(this);
		labClic = new JLabel(etiqClic);
		p4.add(boutonCompteur);
		p4.add(labClic);
		fen.getContentPane().add(p4, BorderLayout.PAGE_END);

		fen.pack();
		fen.setLocationRelativeTo(null);
		fen.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		String texte1, texte2;
		int n1, n2;
		try {
			texte1 = nombre1.getText();
			n1 = Integer.parseInt(texte1);
			texte2 = nombre2.getText();
			n2 = Integer.parseInt(texte2);
		} catch (NumberFormatException ex) {
			nombre1.setText("");
			nombre2.setText("");
			labClic.setText(etiqClic);
			System.out.println("Erreur");
			return;
		}

		if (rBtn1.isSelected()) {
			int n = n1 + n2;
			labClic.setText(etiqClic + n);
		}

		if (rBtn2.isSelected()) {
			int n = n1 - n2;
			labClic.setText(etiqClic + n);
		}

		if (rBtn3.isSelected()) {
			int n = n1 * n2;
			labClic.setText(etiqClic + n);
		}

		if (rBtn4.isSelected()) {
		  try {
			 if (n2 == 0) {
			    throw new ArithmeticException("Division par zéro impossible");
			  }
			    double n = (double) n1 / n2; 			
			    labClic.setText(etiqClic + n);
			}catch(ArithmeticException ex) {
                                labClic.setText("Erreur : " + ex.getMessage());
				nombre2.setText("");
			}
		}
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> new Calculatrice());
	}
}