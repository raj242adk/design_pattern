package sevensem.advancejava.thread.swing;

import javax.swing.*;

public class SwingForm {
    public static void main(String[] args) {
      JFrame frame = new JFrame("Raj Adhikari");
      frame.setSize(800,500);
      JLabel label = new JLabel("Name");
      label.setBounds(10,20,50,50);
      frame.add(label);
      JTextField field = new JTextField();
      field.setBounds(70,20,100,50);
      frame.add(field);

      JButton buttonn = new JButton();
      buttonn.setBounds(120,20,130,50);
      buttonn.setToolTipText("hello");
      frame.add(buttonn);



      JButton button = new JButton("Click Me");
      button.setBounds(40,120,100,50);
      frame.add(button);
      frame.setLayout(null);
      frame.setVisible(true);


    }
}
