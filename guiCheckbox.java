import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// import guiCheckbox.HandlerClass;

public class guiCheckbox extends JFrame{
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public guiCheckbox(){
        super("title button");
        setLayout(new FlowLayout());

        tf = new JTextField("this is sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);

    }
    public class HandlerClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            if(boldbox.isSelected() && italicbox.isSelected()){
                font = new Font("Serif", Font.BOLD+ Font.ITALIC,14);
            }else if(boldbox.isSelected()){
                font = new Font("Serif", Font.BOLD,14);
            }else if(italicbox.isSelected()){
                font = new Font("Serif", Font.ITALIC,14);
            }else{
                font = new Font("Serif", Font.PLAIN,14);
            }
            tf.setFont(font);
        }
    }
}