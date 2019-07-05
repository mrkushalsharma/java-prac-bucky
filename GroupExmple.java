import java.awt.*;

import javax.swing.*;

public class GroupExmple {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        contentPanel.setLayout(groupLayout);

        JLabel clickMe = new JLabel("Click Here");
        JButton button = new JButton("This Button");

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addComponent(clickMe).addComponent(button));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(clickMe).addComponent(button));
        frame.pack();
        frame.setVisible(true);
    }
}