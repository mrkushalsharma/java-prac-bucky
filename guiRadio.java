import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class guiRadio extends JFrame{
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public guiRadio(){
        super("title");
        setLayout(new FlowLayout());
        tf = new JTextField("kushal",25);
        add(tf);
        
        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", true);
        ib = new JRadioButton("italic", true);
        bib = new JRadioButton("bold and itallic", true);
        add(pb);
        add(bb);
        add(ib);
        add(bib);
        
        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif", Font.PLAIN,14);
        bf = new Font("Serif", Font.BOLD,14);
        itf = new Font("Serif", Font.ITALIC,14);
        bif = new Font("Serif", Font.BOLD+Font.ITALIC,14);
        tf.setFont(pf);

        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));

    }

    public class HandlerClass implements ItemListener{
        private Font font;
        public HandlerClass(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }
    }

}