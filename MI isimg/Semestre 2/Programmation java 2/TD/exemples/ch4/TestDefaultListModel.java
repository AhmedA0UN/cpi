import javax.swing.*;
public class TestDefaultListModel {

	public TestDefaultListModel() {
		JFrame f = new JFrame("DefaultListModel Exemple");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Item 1");
		listModel.addElement("Item 2");
		listModel.addElement("Item 3");
		JList<String> list = new JList<>(listModel);
		f.getContentPane().add(new JScrollPane(list));
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TestDefaultListModel();
	}
}
