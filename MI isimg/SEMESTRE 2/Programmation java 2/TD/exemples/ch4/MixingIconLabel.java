import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.*;

public class MixingIconLabel {
  public static void main(String[] args) throws IOException {
    JFrame frame = new JFrame();
    frame.setTitle("JLabel Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    
    JPanel p = new JPanel();
	p.setBorder(BorderFactory.createTitledBorder("Bordure"));

    ImageIcon imageIcon = new ImageIcon("abc.gif");

    JLabel label = new JLabel("CPI2", imageIcon,SwingConstants.LEADING);
    label.setPreferredSize(new Dimension(300,300));
   label.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
 // label.setHorizontalTextPosition(SwingConstants.LEFT);
   label.setVerticalTextPosition(SwingConstants.BOTTOM);
    
    p.add(label);

    frame.getContentPane().add(p);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}