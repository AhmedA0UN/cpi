import javax.swing.*;

public class TestList {
	public TestList() {
		JFrame f = new JFrame("AbstractListModel Exemple");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyListModelAdapter listModel = new MyListModelAdapter();
		JList<String> list = new JList<>(listModel);
		f.getContentPane().add(new JScrollPane(list));
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TestList();
	}

	class MyListModelAdapter extends AbstractListModel<String> {

		private static final long serialVersionUID = 1L;
		
		private final String[] data;
		
		public MyListModelAdapter() {
		    data = new String[] { "Item 1", "Item 2", "Item 3" };
		}
		
		@Override
		public int getSize() {
			return data.length;
		}

		@Override
		public String getElementAt(int index) {
			return data[index];
		}
	}
}
