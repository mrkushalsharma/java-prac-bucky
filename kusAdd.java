import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class kusAdd extends JFrame {
    private JButton lb;
    private FlowLayout layout;
    private JTextField textField;
    private JTextField textField_1;

    public kusAdd() {
        super("title");

        layout = new FlowLayout();
        setLayout(layout);

        JLabel lblFirstNumber = new JLabel("First Number");

        textField = new JTextField();
        textField.setColumns(10);
        add(lblFirstNumber);
        add(textField);

        JLabel lblSecondNumber = new JLabel("second Number");

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        add(lblSecondNumber);
        add(textField_1);

        lb = new JButton("Add");
        add(lb);
        JLabel lblResult = new JLabel("Result : ");
        add(lblResult);

        lb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String first = textField.getText();
                String second = textField_1.getText();
                int sum = Integer.parseInt(first) + Integer.parseInt(second);
                System.out.println(sum);
                lblResult.setText("Result: " + sum);
            }

        });

    }

    public static void main(String[] args) {
        kusAdd l = new kusAdd();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(200, 200);
        l.setVisible(true);
    }
}