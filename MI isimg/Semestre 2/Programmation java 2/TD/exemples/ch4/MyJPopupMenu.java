import javax.swing.*;
import java.awt.event.*;

public class MyJPopupMenu {
	JFrame frame;
	JPopupMenu menu;
	JMenuItem couper, copier, coller;

	MyJPopupMenu() {
		frame = new JFrame("Exemple PopupMenu");
		menu = new JPopupMenu("Menu");

		couper = new JMenuItem("Couper");
		copier = new JMenuItem("Copier");
		coller = new JMenuItem("Coller");

		menu.add(couper);
		menu.add(copier);
		menu.add(coller);

		frame.addMouseListener(new MouseAdapter() {
			// événement relachement du bouton droit de la souris
			public void mouseReleased(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON3)
					menu.show(frame, e.getX(), e.getY());
			}
		});

		frame.add(menu);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		new MyJPopupMenu();
	}
}