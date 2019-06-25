import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class guiButton extends JFrame{
    private JButton reg;
    private JButton custom;

    public guiButton(){
        super("title button");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        // Icon b = new ImageIcon(getClass().getResource("b.png"));
        // Icon x = new ImageIcon(getClass().getResource("x.png"));
        // custom.setRolloverIcon("custom",b);
        // add(custom);

        HandlerClass handler = new HandlerClass();

        reg.addActionListener(handler);
        // custom.addActionListener(handler);
        
    }
    public class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string = "event";
        
            JOptionPane.showMessageDialog(null, string);
        }
    }
}