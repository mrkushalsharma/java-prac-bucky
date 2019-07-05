import java.awt.*;
import javax.swing.*;

public class MyGridLayout {
    JFrame f;

    MyGridLayout() {
        f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(new GridLayout(3, 3));
        // setting grid layout of 3 rows and 3 columns

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}