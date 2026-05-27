import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class DemoJComboBox {

    public static void main(String[] args) {
	JFrame frame = new JFrame("Test JComboBox");
	DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
	model.addElement("Element 1");
	model.addElement("Element 2");
	model.addElement("Element 3");
	JComboBox<String> combo = new JComboBox<>(model);
	combo.insertItemAt("Element 4",2);
	//combo.setEditable(true);
	JButton button = new JButton("Ajouter");
	JTextArea textArea = new JTextArea(10, 20);
	
	button.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent evt) {
		if (combo.getSelectedIndex() != -1) {
		    String elt = combo.getSelectedItem().toString();
		    textArea.setText(textArea.getText() + elt + "\n");
		}
	    }
	});
	

	frame.getContentPane().add(combo, BorderLayout.PAGE_START);
	frame.getContentPane().add(button, BorderLayout.CENTER);
	frame.getContentPane().add(textArea, BorderLayout.PAGE_END);
 

	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);	

    }
 
}