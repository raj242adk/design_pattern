package sevensem.advancejava.thread.swing;

import javax.swing.*;

public class ButtonJ {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Raj Adhiakri");
        JButton b = new JButton("Click Me");
        b.setBounds(50,50,100,30);
        frame.setSize(800,500);
        frame.add(b);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
